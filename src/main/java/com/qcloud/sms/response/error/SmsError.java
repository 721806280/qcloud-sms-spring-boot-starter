package com.qcloud.sms.response.error;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 请求错误
 *
 * @author xm.z
 */
@Data
public class SmsError {

    /**
     * 错误码
     */
    @JsonProperty("Code")
    private String code;

    /**
     * 错误信息
     */
    @JsonProperty("Message")
    private String message;

}