package com.qcloud.sms.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 套餐包信息统计响应包体
 *
 * @author xm.z
 */
@Data
public class SmsPackagesStatistics {

    /**
     * 套餐包创建时间，UNIX 时间戳（单位：秒）
     */
    @JsonProperty("PackageCreateTime")
    private Long packageCreateTime;

    /**
     * 套餐包过期时间，UNIX 时间戳（单位：秒）
     */
    @JsonProperty("PackageExpiredTime")
    private Long packageExpiredTime;

    /**
     * 套餐包生效时间，UNIX 时间戳（单位：秒）
     */
    @JsonProperty("PackageEffectiveTime")
    private Long packageEffectiveTime;

    /**
     * 套餐包类别，0表示赠送套餐包，1表示购买套餐包
     */
    @JsonProperty("PackageType")
    private Long packageType;

    /**
     * 当前使用套餐包条数
     */
    @JsonProperty("CurrentUsage")
    private Long currentUsage;

    /**
     * 套餐包 ID
     */
    @JsonProperty("PackageId")
    private Long packageId;

    /**
     * 套餐包条数
     */
    @JsonProperty("PackageAmount")
    private Long packageAmount;

}
