package com.qcloud.sms.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.qcloud.sms.http.AbstractRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * CallbackStatusStatisticsRequest
 *
 * @author xm.z
 */
@Getter
@AllArgsConstructor
@Builder(toBuilder = true)
public class CallbackStatusStatisticsRequest extends AbstractRequest {

    /**
     * 描述：最大上限。目前固定设置为0。 是否必填：是
     */
    @JsonProperty("Limit")
    private final Integer limit;

    /**
     * 描述：偏移量。 目前固定设置为0。 是否必填：是
     */
    @JsonProperty("Offset")
    private final Integer offset;

    /**
     * 描述：起始时间，格式为yyyymmddhh，精确到小时，例如2021050113，表示2021年5月1号13时。 注：拉取套餐包的创建时间不小于起始时间。
     * 是否必填：是
     */
    @JsonProperty("BeginTime")
    private final String beginTime;

    /**
     * 描述：结束时间，格式为yyyymmddhh，精确到小时，例如2021050118，表示2021年5月1号18时。 注：EndTime 必须大于
     * BeginTime，拉取套餐包的创建时间不大于结束时间。 是否必填：是
     */
    @JsonProperty("EndTime")
    private final String endTime;

}