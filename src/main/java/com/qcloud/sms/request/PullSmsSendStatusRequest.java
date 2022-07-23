package com.qcloud.sms.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.qcloud.sms.http.AbstractRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * PullSmsSendStatusRequest
 *
 * @author xm.z
 */
@Getter
@AllArgsConstructor
@Builder(toBuilder = true)
public class PullSmsSendStatusRequest extends AbstractRequest {

    /**
     * 描述：拉取最大条数，最多100条。 是否必填：是
     */
    @JsonProperty("Limit")
    private final Integer limit;

}