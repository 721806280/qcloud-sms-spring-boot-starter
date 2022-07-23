package com.qcloud.sms.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 发送数据统计响应包体
 *
 * @author xm.z
 */
@Data
public class SendStatusStatistics {

    /**
     * 短信计费条数统计 例如提交成功量为100条，其中有20条是长短信（长度为80字）被拆分成2条则计费条数为：80 * 1 + 20 * 2 = 120 条
     */
    @JsonProperty("FeeCount")
    private Long feeCount;

    /**
     * 短信提交量统计
     */
    @JsonProperty("RequestCount")
    private Long requestCount;

    /**
     * 短信提交成功量统计
     */
    @JsonProperty("RequestSuccessCount")
    private Long requestSuccessCount;

}
