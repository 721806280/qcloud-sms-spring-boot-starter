package com.qcloud.sms.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 回执数据统计响应包体
 *
 * @author xm.z
 */
@Data
public class CallbackStatusStatistics {

    /**
     * 短信回执量统计
     */
    @JsonProperty("CallbackCount")
    private Long callbackCount;

    /**
     * 短信提交成功量统计
     */
    @JsonProperty("RequestSuccessCount")
    private Long requestSuccessCount;

    /**
     * 短信回执失败量统计
     */
    @JsonProperty("CallbackFailCount")
    private Long callbackFailCount;

    /**
     * 短信回执成功量统计
     */
    @JsonProperty("CallbackSuccessCount")
    private Long callbackSuccessCount;

    /**
     * 运营商内部错误统计
     */
    @JsonProperty("InternalErrorCount")
    private Long internalErrorCount;

    /**
     * 号码无效或空号统计
     */
    @JsonProperty("InvalidNumberCount")
    private Long invalidNumberCount;

    /**
     * 停机、关机等错误统计
     */
    @JsonProperty("ShutdownErrorCount")
    private Long shutdownErrorCount;

    /**
     * 号码拉入黑名单统计
     */
    @JsonProperty("BlackListCount")
    private Long blackListCount;

    /**
     * 运营商频率限制统计
     */
    @JsonProperty("FrequencyLimitCount")
    private Long frequencyLimitCount;

}