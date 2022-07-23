package com.qcloud.sms;

import com.qcloud.sms.request.*;
import com.qcloud.sms.response.*;

/**
 * QcloudSms <a href="https://cloud.tencent.com/document/product/382/52077">文档地址</a>
 *
 * @author xm.z
 */
public interface QcloudSms {

    /**
     * 指定模板单发短信
     *
     * @param sendSmsRequest 请求参数
     * @return SendSmsResponse
     */
    SendSmsResponse sendSms(SendSmsRequest sendSmsRequest);

    /**
     * 发送短信数据统计
     *
     * @param sendStatusStatisticsRequest 请求参数
     * @return SendStatusStatisticsResponse
     */
    SendStatusStatisticsResponse sendStatusStatistics(SendStatusStatisticsRequest sendStatusStatisticsRequest);

    /**
     * 回执数据统计
     *
     * @param callbackStatusStatisticsRequest 请求参数
     * @return CallbackStatusStatisticsResponse
     */
    CallbackStatusStatisticsResponse callbackStatusStatistics(
            CallbackStatusStatisticsRequest callbackStatusStatisticsRequest);

    /**
     * 查询短信套餐包信息
     *
     * @param smsPackagesStatisticsRequest 请求参数
     * @return SmsPackagesStatisticsResponse
     */
    SmsPackagesStatisticsResponse smsPackagesStatistics(SmsPackagesStatisticsRequest smsPackagesStatisticsRequest);

    /**
     * 拉取单个号码短信下发状态
     *
     * @param pullSmsSendStatusByPhoneNumberRequest 请求参数
     * @return PullSmsSendStatusResponse
     */
    PullSmsSendStatusResponse pullSmsSendStatusByPhoneNumber(
            PullSmsSendStatusByPhoneNumberRequest pullSmsSendStatusByPhoneNumberRequest);

    /**
     * 拉取短信下发状态
     *
     * @param pullSmsSendStatusRequest 请求参数
     * @return PullSmsSendStatusResponse
     */
    PullSmsSendStatusResponse pullSmsSendStatus(PullSmsSendStatusRequest pullSmsSendStatusRequest);

    /**
     * 拉取单个号码短信回复状态
     *
     * @param pullSmsReplyStatusByPhoneNumberRequest 请求参数
     * @return PullSmsReplyStatusResponse
     */
    PullSmsReplyStatusResponse pullSmsReplyStatusByPhoneNumber(
            PullSmsReplyStatusByPhoneNumberRequest pullSmsReplyStatusByPhoneNumberRequest);

    /**
     * 拉取短信回复状态
     *
     * @param pullSmsReplyStatusRequest 请求参数
     * @return PullSmsReplyStatusResponse
     */
    PullSmsReplyStatusResponse pullSmsReplyStatus(PullSmsReplyStatusRequest pullSmsReplyStatusRequest);

}