package com.qcloud.sms.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.qcloud.sms.http.AbstractRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * SendSingleSmsRequest
 *
 * @author xm.z
 */
@Getter
@AllArgsConstructor
@Builder(toBuilder = true)
public class SendSmsRequest extends AbstractRequest {

    /**
     * 描述：下发手机号码，采用 E.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号且要求全为境内手机号或全为境外手机号。
     * 例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号 是否必填：是
     */
    @JsonProperty("PhoneNumberSet")
    private final String[] phoneNumberSet;

    /**
     * 描述：短信签名内容 示例：腾讯云 是否必填：是
     */
    @JsonProperty("SignName")
    private final String signName;

    /**
     * 描述：模板ID 示例：19 是否必填：是
     */
    @JsonProperty("TemplateId")
    private final String templateId;

    /**
     * 描述：模板参数，具体使用方法请参见下方说明。若模板没有参数，请设置为空数组。 示例：["验证码", "1234","4"] 是否必填：是
     */
    @JsonProperty("TemplateParamSet")
    private final String[] templateParam;

    /**
     * 描述：用户的 session 内容，腾讯 server 回包中会原样返回，可选字段，不需要时设置为空。 是否必填：否
     */
    @JsonProperty("SessionContext")
    private final String sessionContext;

    /**
     * 描述：短信码号扩展号，格式为纯数字串，其他格式无效。默认没有开通，如需开通请联系 sms helper 。 是否必填：否
     */
    @JsonProperty("ExtendCode")
    private final String extendCode;

}