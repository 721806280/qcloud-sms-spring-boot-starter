package com.qcloud.sms.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.qcloud.sms.http.AbstractResponse;
import lombok.Data;

/**
 * CallbackStatusStatisticsResponse
 *
 * @author xm.z
 */
@Data
public class CallbackStatusStatisticsResponse extends AbstractResponse {

    @JsonProperty("CallbackStatusStatistics")
    private CallbackStatusStatistics callbackStatusStatistics;

}