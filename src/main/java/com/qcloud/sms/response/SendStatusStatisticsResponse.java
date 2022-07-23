package com.qcloud.sms.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.qcloud.sms.http.AbstractResponse;
import lombok.Data;

/**
 * SendStatusStatisticsResponse
 *
 * @author xm.z
 */
@Data
public class SendStatusStatisticsResponse extends AbstractResponse {

    @JsonProperty("SendStatusStatistics")
    private SendStatusStatistics sendStatusStatistics;

}