package com.qcloud.sms.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 短信的下发状态详细信息
 *
 * @author xm.z
 */
@Data
public class PullSmsSendStatus {

    /**
     * 用户实际接收到短信的时间，UNIX 时间戳（单位：秒）
     */
    @JsonProperty("UserReceiveTime")
    private Integer userReceiveTime;

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
     * 本次发送标识ID
     */
    @JsonProperty("SerialNo")
    private String serialNo;

    /**
     * 实际是否收到短信接收状态，SUCCESS（成功）、FAIL（失败）
     */
    @JsonProperty("ReportStatus")
    private String reportStatus;

    /**
     * 用户接收短信状态描述
     */
    @JsonProperty("Description")
    private String description;

}