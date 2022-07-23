package com.qcloud.sms.response;

import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.qcloud.sms.exception.QcloudSmsException;
import com.qcloud.sms.http.AbstractResponse;
import com.qcloud.sms.response.error.enums.BusinessError;
import lombok.Data;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * SendMultiSmsResponse
 *
 * @author xm.z
 */
@Data
public class SendSmsResponse extends AbstractResponse {

    @JsonProperty("SendStatusSet")
    private List<SendStatus> sendStatusSet;

    public void businessError() {
        List<String> codes = this.getSendStatusSet().stream().map(SendStatus::getCode).collect(Collectors.toList());
        Optional<BusinessError> first = codes.stream().filter(v -> !StrUtil.equals("Ok", v))
                .map(BusinessError::getByCode).findFirst();
        if (first.isPresent()) {
            throw new QcloudSmsException(first.get().getInfo());
        }
    }

}