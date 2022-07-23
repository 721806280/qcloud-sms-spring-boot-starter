package com.qcloud.sms;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * QcloudSmsAutoConfiguration
 *
 * @author xm.z
 */
@AutoConfiguration
@EnableConfigurationProperties(QcloudSmsProperties.class)
@ConditionalOnProperty(prefix = "qcloud.sms", name = {"app-id", "app-key", "secret-id", "secret-key"})
public class QcloudSmsAutoConfiguration {

    @Bean
    public QcloudSms qcloudSms(QcloudSmsProperties qcloudSmsProperties) {
        return new QcloudSmsImpl(qcloudSmsProperties);
    }

}