package com.qcloud.sms.http;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qcloud.sms.QcloudSmsProperties;
import com.qcloud.sms.constants.QcloudSmsConstants;
import com.qcloud.sms.exception.QcloudSmsException;
import com.qcloud.sms.response.error.SmsError;
import com.qcloud.sms.response.error.enums.BusinessError;
import com.qcloud.sms.response.error.enums.PublicError;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.TreeMap;

import static com.qcloud.sms.constants.QcloudSmsConstants.HOST;

/**
 * AbstractHttpClient
 *
 * @author xm.z
 */
@Slf4j
public abstract class AbstractHttpClient {

    private final ObjectMapper objectMapper;

    private final QcloudSmsProperties qcloudSmsProperties;

    protected AbstractHttpClient(QcloudSmsProperties qcloudSmsProperties) {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        this.qcloudSmsProperties = qcloudSmsProperties;
    }

    @SneakyThrows
    protected String postParamsJson(String action, AbstractRequest abstractRequest) {
        abstractRequest.setSmsSdkAppId(this.qcloudSmsProperties.getAppId());
        String json = this.objectMapper.writeValueAsString(abstractRequest);
        return postParamsJson(action, json);
    }

    @SneakyThrows
    protected <T extends AbstractResponse> T convert(String json, Class<T> targetClass) {
        T t = this.objectMapper.readValue(json, targetClass);
        SmsError error = t.getError();
        if (error != null) {
            PublicError publicError = PublicError.getByCode(error.getCode());
            if (publicError != null) {
                throw new QcloudSmsException(publicError.getInfo());
            }

            BusinessError businessError = BusinessError.getByCode(error.getCode());
            if (businessError != null) {
                throw new QcloudSmsException(businessError.getInfo());
            }
        }
        return t;
    }

    private String postParamsJson(String action, String payload) {
        // 构建请求数据
        HttpRequest httpRequest = HttpUtil.createPost(QcloudSmsConstants.URL)
                .headerMap(signHeaders(action, payload), true).body(payload);
        if (log.isDebugEnabled()) {
            log.debug("腾讯云短信地址：[{}] 请求数据：[{}]", QcloudSmsConstants.URL, payload);
        }
        // 获取响应数据
        HttpResponse response = httpRequest.execute();
        if (!response.isOk()) {
            throw new QcloudSmsException("响应状态异常");
        }
        String body = response.body();
        if (body == null) {
            throw new QcloudSmsException("响应数据为空");
        }
        if (log.isDebugEnabled()) {
            log.debug("腾讯云短信响应数据：[{}]", body);
        }
        return body;
    }

    @SneakyThrows
    private TreeMap<String, String> signHeaders(String action, String payload) {
        String algorithm = "TC3-HMAC-SHA256";
        String timestamp = String.valueOf(DateUtil.currentSeconds());
        SimpleDateFormat sdf = new SimpleDateFormat(DatePattern.NORM_DATE_PATTERN);
        // 注意时区，否则容易出错
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String date = sdf.format(new Date(Long.parseLong(timestamp + "000")));

        // ************* 步骤 1：拼接规范请求串 *************
        String httpRequestMethod = "POST";
        String canonicalUri = "/";
        String canonicalQueryString = "";
        String canonicalHeaders = "content-type:application/json; charset=utf-8\n" + "host:" + HOST + "\n";
        String signedHeaders = "content-type;host";

        String hashedRequestPayload = SecureUtil.sha256(payload);
        String canonicalRequest = httpRequestMethod + "\n" + canonicalUri + "\n" + canonicalQueryString + "\n"
                + canonicalHeaders + "\n" + signedHeaders + "\n" + hashedRequestPayload;

        // ************* 步骤 2：拼接待签名字符串 *************
        String credentialScope = StrUtil.format("{}/{}/tc3_request", date, QcloudSmsConstants.SERVICE);
        String hashedCanonicalRequest = SecureUtil.sha256(canonicalRequest);
        String stringToSign = algorithm + "\n" + timestamp + "\n" + credentialScope + "\n" + hashedCanonicalRequest;

        // ************* 步骤 3：计算签名 *************
        byte[] secretDate = SecureUtil
                .hmacSha256(("TC3" + this.qcloudSmsProperties.getSecretKey()).getBytes(StandardCharsets.UTF_8))
                .digest(date);
        byte[] secretService = SecureUtil.hmacSha256(secretDate).digest(QcloudSmsConstants.SERVICE);
        byte[] secretSigning = SecureUtil.hmacSha256(secretService).digest("tc3_request");
        String signature = SecureUtil.hmacSha256(secretSigning).digestHex(stringToSign).toLowerCase();

        // ************* 步骤 4：拼接 Authorization *************
        String authorization = StrUtil.format("{} Credential={}/{}, SignedHeaders={}, Signature={}", algorithm,
                this.qcloudSmsProperties.getSecretId(), credentialScope, signedHeaders, signature);

        TreeMap<String, String> headers = new TreeMap<>();
        headers.put("Authorization", authorization);
        headers.put("Content-Type", "application/json; charset=utf-8");
        headers.put("Host", HOST);
        headers.put("X-TC-Action", action);
        headers.put("X-TC-Timestamp", timestamp);
        headers.put("X-TC-Version", QcloudSmsConstants.VERSION);
        headers.put("X-TC-Region", this.qcloudSmsProperties.getRegion());
        return headers;
    }

}