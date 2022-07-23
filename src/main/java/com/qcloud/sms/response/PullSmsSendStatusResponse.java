package com.qcloud.sms.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.qcloud.sms.http.AbstractResponse;
import lombok.Data;

import java.util.List;

/**
 * PullSmsSendStatusResponse
 *
 * @author xm.z
 */
@Data
public class PullSmsSendStatusResponse extends AbstractResponse {

    @JsonProperty("PullSmsSendStatusSet")
    private List<PullSmsSendStatus> pullSmsSendStatusSet;

}