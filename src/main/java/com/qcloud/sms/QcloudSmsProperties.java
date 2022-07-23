package com.qcloud.sms;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 腾讯云短信密钥配置信息
 *
 * @author xm.z
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "qcloud.sms")
public class QcloudSmsProperties {

    /**
     * 应用ID
     */
    private String appId;

    /**
     * 应用KEY
     */
    private String appKey;

    /**
     * 密钥ID
     */
    private String secretId;

    /**
     * 密钥KEY
     */
    private String secretKey;

    /**
     * 地域
     *
     * <p>
     * 华北地区(北京) ap-beijing 华南地区(广州) ap-guangzhou 华东地区(南京) ap-nanjing
     * </p>
     */
    private String region = "ap-beijing";

}