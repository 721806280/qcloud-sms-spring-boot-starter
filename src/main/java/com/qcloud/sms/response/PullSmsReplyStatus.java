package com.qcloud.sms.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 短信回复状态
 *
 * @author xm.z
 */
@Data
public class PullSmsReplyStatus {

    /**
     * 短信码号扩展号，默认未开通，如需开通请联系 sms helper。
     */
    @JsonProperty("ExtendCode")
    private String extendCode;

    /**
     * 国家（或地区）码
     */
    @JsonProperty("CountryCode")
    private String countryCode;

    /**
     * 用户号码，普通格式，示例如：13711112222
     */
    @JsonProperty("SubscriberNumber")
    private String subscriberNumber;

    /**
     * 手机号码，E.164标准，+[国家或地区码][手机号] 示例如：+8613711112222， 其中前面有一个+号，86为国家码，13711112222为手机号
     */
    @JsonProperty("PhoneNumber")
    private String phoneNumber;

    /**
     * 短信签名名称
     */
    @JsonProperty("SignName")
    private String signName;

    /**
     * 用户回复的内容
     */
    @JsonProperty("ReplyContent")
    private String replyContent;

    /**
     * 回复时间，UNIX 时间戳（单位：秒）
     */
    @JsonProperty("ReplyTime")
    private Long replyTime;

}