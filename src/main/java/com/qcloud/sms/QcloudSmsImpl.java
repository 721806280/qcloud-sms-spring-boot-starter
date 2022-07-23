package com.qcloud.sms;

import com.qcloud.sms.http.AbstractHttpClient;
import com.qcloud.sms.request.*;
import com.qcloud.sms.response.*;

/**
 * QcloudSmsImpl
 *
 * @author xm.z
 */
public class QcloudSmsImpl extends AbstractHttpClient implements QcloudSms {

    public QcloudSmsImpl(QcloudSmsProperties qcloudSmsProperties) {
        super(qcloudSmsProperties);
    }

    @Override
    public SendSmsResponse sendSms(SendSmsRequest sendSmsRequest) {
        String responseJson = postParamsJson("SendSms", sendSmsRequest);
        return convert(responseJson, SendSmsResponse.class);
    }

    @Override
    public SendStatusStatisticsResponse sendStatusStatistics(SendStatusStatisticsRequest sendStatusStatisticsRequest) {
        String responseJson = postParamsJson("SendStatusStatistics", sendStatusStatisticsRequest);
        return convert(responseJson, SendStatusStatisticsResponse.class);
    }

    @Override
    public CallbackStatusStatisticsResponse callbackStatusStatistics(
            CallbackStatusStatisticsRequest callbackStatusStatisticsRequest) {
        String responseJson = postParamsJson("CallbackStatusStatistics", callbackStatusStatisticsRequest);
        return convert(responseJson, CallbackStatusStatisticsResponse.class);
    }

    @Override
    public SmsPackagesStatisticsResponse smsPackagesStatistics(
            SmsPackagesStatisticsRequest smsPackagesStatisticsRequest) {
        String responseJson = postParamsJson("SmsPackagesStatistics", smsPackagesStatisticsRequest);
        return convert(responseJson, SmsPackagesStatisticsResponse.class);
    }

    @Override
    public PullSmsSendStatusResponse pullSmsSendStatusByPhoneNumber(
            PullSmsSendStatusByPhoneNumberRequest pullSmsSendStatusByPhoneNumberRequest) {
        String responseJson = postParamsJson("PullSmsSendStatusByPhoneNumber", pullSmsSendStatusByPhoneNumberRequest);
        return convert(responseJson, PullSmsSendStatusResponse.class);
    }

    @Override
    public PullSmsSendStatusResponse pullSmsSendStatus(PullSmsSendStatusRequest pullSmsSendStatusRequest) {
        String responseJson = postParamsJson("PullSmsSendStatus", pullSmsSendStatusRequest);
        return convert(responseJson, PullSmsSendStatusResponse.class);
    }

    @Override
    public PullSmsReplyStatusResponse pullSmsReplyStatusByPhoneNumber(
            PullSmsReplyStatusByPhoneNumberRequest pullSmsReplyStatusByPhoneNumberRequest) {
        String responseJson = postParamsJson("PullSmsReplyStatusByPhoneNumber", pullSmsReplyStatusByPhoneNumberRequest);
        return convert(responseJson, PullSmsReplyStatusResponse.class);
    }

    @Override
    public PullSmsReplyStatusResponse pullSmsReplyStatus(PullSmsReplyStatusRequest pullSmsReplyStatusRequest) {
        String responseJson = postParamsJson("PullSmsReplyStatus", pullSmsReplyStatusRequest);
        return convert(responseJson, PullSmsReplyStatusResponse.class);
    }

}