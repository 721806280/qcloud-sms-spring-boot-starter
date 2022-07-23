package com.qcloud.sms.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.qcloud.sms.http.AbstractResponse;
import lombok.Data;

import java.util.List;

/**
 * SmsPackagesStatisticsResponse
 *
 * @author xm.z
 */
@Data
public class SmsPackagesStatisticsResponse extends AbstractResponse {

    @JsonProperty("SmsPackagesStatisticsSet")
    private List<SmsPackagesStatistics> smsPackagesStatisticsSet;

}