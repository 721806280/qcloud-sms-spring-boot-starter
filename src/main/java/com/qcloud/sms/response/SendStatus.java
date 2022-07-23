package com.qcloud.sms.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 发送短信状态
 *
 * @author xm.z
 */
@Data
public class SendStatus {

    /**
     * 发送流水号
     */
    @JsonProperty("SerialNo")
    private String serialNo;

    /**
     * 手机号码，E.164标准，+[国家或地区码][手机号] 示例如：+8613711112222， 其中前面有一个+号 86为国家码 13711112222为手机号。
     */
    @JsonProperty("PhoneNumber")
    private String phoneNumber;

    /**
     * 计费条数，计费规则请查询
     * <a href="https://cloud.tencent.com/document/product/382/36135">计费策略</a>
     */
    @JsonProperty("Fee")
    private Long fee;

    /**
     * 用户session内容
     */
    @JsonProperty("SessionContext")
    private String sessionContext;

    /**
     * 短信请求错误码
     */
    @JsonProperty("Code")
    private String code;

    /**
     * 短信请求错误码，具体含义请参考
     * <a href="https://cloud.tencent.com/document/product/382/49316">错误码</a>
     */
    @JsonProperty("Message")
    private String message;

    /**
     * 国家码或地区码，例如 CN、US 等，对于未识别出国家码或者地区码，默认返回 DEF 具体支持列表请参考
     * <a href="https://cloud.tencent.com/document/product/382/18051">国际/港澳台短信价格总览</a>
     */
    @JsonProperty("IsoCode")
    private String isoCode;

}