package com.qcloud.sms.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.qcloud.sms.http.AbstractRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * PullSmsReplyStatusByPhoneNumberRequest
 *
 * @author xm.z
 */
@Getter
@AllArgsConstructor
@Builder(toBuilder = true)
public class PullSmsReplyStatusByPhoneNumberRequest extends AbstractRequest {

    /**
     * 描述：拉取最大条数，最多 100。 是否必填：是
     */
    @JsonProperty("Limit")
    private final Integer limit;

    /**
     * 描述：偏移量。 注：目前固定设置为0。 是否必填：是
     */
    @JsonProperty("Offset")
    private final Integer offset;

    /**
     * 描述：拉取起始时间，UNIX 时间戳（时间：秒）。 注：最大可拉取当前时期前7天的数据。 是否必填：是
     */
    @JsonProperty("BeginTime")
    private final String beginTime;

    /**
     * 描述：拉取截止时间，UNIX 时间戳（时间：秒）。 是否必填：是
     */
    @JsonProperty("EndTime")
    private final String endTime;

    /**
     * 描述：下发目的手机号码，依据 E.164 标准为：+[国家（或地区）码][手机号] 示例如：+8613711112222， 其中前面有一个+号
     * ，86为国家码，13711112222为手机号 是否必填：是
     */
    @JsonProperty("PhoneNumber")
    private final String phoneNumber;

}