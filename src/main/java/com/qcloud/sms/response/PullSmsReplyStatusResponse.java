package com.qcloud.sms.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.qcloud.sms.http.AbstractResponse;
import lombok.Data;

import java.util.List;

/**
 * PullSmsReplyStatusResponse
 *
 * @author xm.z
 */
@Data
public class PullSmsReplyStatusResponse extends AbstractResponse {

    @JsonProperty("PullSmsReplyStatusSet")
    private List<PullSmsReplyStatus> pullSmsReplyStatusSet;

}