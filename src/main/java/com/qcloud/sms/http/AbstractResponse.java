package com.qcloud.sms.http;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.qcloud.sms.response.error.SmsError;
import lombok.Data;

/**
 * AbstractResponse
 *
 * @author xm.z
 */
@Data
@JsonRootName(value = "Response")
public abstract class AbstractResponse {

    @JsonProperty("RequestId")
    private String requestId;

    @JsonProperty("Error")
    private SmsError error;

}