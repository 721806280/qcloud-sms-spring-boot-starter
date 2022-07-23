package com.qcloud.sms.http;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * AbstractRequest
 *
 * @author xm.z
 */
@Data
public abstract class AbstractRequest {

    /**
     * 描述：SdkAppId 在短信控制台添加应用后生成的实际 SdkAppId 示例如1400006666 是否必填：是
     */
    @JsonProperty("SmsSdkAppId")
    private String smsSdkAppId;

}
