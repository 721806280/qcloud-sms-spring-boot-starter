package com.qcloud.sms.response.error.enums;

import cn.hutool.core.util.StrUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 业务错误 <a href="https://cloud.tencent.com/document/product/382/52075">参考地址</a>
 *
 * @author xm.z
 */
@Getter
@AllArgsConstructor
public enum BusinessError {

    FAILED_OPERATION_CONTAIN_SENSITIVE_WORD("FailedOperation.ContainSensitiveWord", "短信内容中含有敏感词"),
    FAILED_OPERATION_FAIL_RESOLVE_PACKET("FailedOperation.FailResolvePacket", "请求包解析失败，通常情况下是由于没有遵守 API 接口说明规范导致"),
    FAILED_OPERATION_FORBID_ADD_MARKETING_TEMPLATES("FailedOperation.ForbidAddMarketingTemplates", "个人用户不能申请营销短信"),
    FAILED_OPERATION_INSUFFICIENT_BALANCE_IN_SMS_PACKAGE(
            "FailedOperation.InsufficientBalanceInSmsPackage", "套餐包余量不足，请购买套餐包"),
    FAILED_OPERATION_JSON_PARSE_FAIL("FailedOperation.JsonParseFail", "解析请求包体时候失败"),
    FAILED_OPERATION_MARKETING_SEND_TIME_CONSTRAINT("FailedOperation.MarketingSendTimeConstraint",
            "营销短信发送时间限制，为避免骚扰用户，营销短信只允许在8点到22点发送"),
    FAILED_OPERATION_MISSING_SIGNATURE("FailedOperation.MissingSignature", "没有申请签名之前，无法申请模板，请根据创建签名申请完成之后再次申请。"),
    FAILED_OPERATION_MISSING_SIGNATURE_LIST("FailedOperation.MissingSignatureList", "无法识别签名，请确认是否已有签名通过申请"),
    FAILED_OPERATION_MISSING_SIGNATURE_TO_MODIFY("FailedOperation.MissingSignatureToModify",
            "此签名ID未提交申请或不存在，不能进行修改操作，请检查您的SignId是否填写正确"),
    FAILED_OPERATION_MISSING_TEMPLATE_LIST("FailedOperation.MissingTemplateList",
            "无法识别模板，请确认是否已有模板通过申请，一般是模板未通过申请，可以查看 模板审核"),
    FAILED_OPERATION_MISSING_TEMPLATE_TO_MODIFY("FailedOperation.MissingTemplateToModify",
            "此模板ID未提交申请或不存在，不能进行修改操作，请检查您的TemplateId是否填写正确"),
    FAILED_OPERATION_NOT_ENTERPRISE_CERTIFICATION("FailedOperation.NotEnterpriseCertification",
            "非企业认证无法使用签名及模版相关接口，您可以 变更实名认证模式，变更为企业认证用户后，约1小时左右生效"),
    FAILED_OPERATION_OTHER_ERROR("FailedOperation.OtherError", "其他错误"),
    FAILED_OPERATION_PARAMETERS_OTHER_ERROR("FailedOperation.ParametersOtherError", "未知错误"),
    FAILED_OPERATION_PHONE_NUMBER_IN_BLACK_LIST("FailedOperation.PhoneNumberInBlacklist", "此手机号在黑名单库中"),
    FAILED_OPERATION_SIGN_NUMBER_LIMIT("FailedOperation.SignNumberLimit", "签名个数达到最大值"),
    FAILED_OPERATION_SIGNATURE_INCORRECT_OR_UNAPPROVED("FailedOperation.SignatureIncorrectOrUnapproved", "签名未审批或格式错误"),
    FAILED_OPERATION_TEMPLATE_ALREADY_PASSED_CHECK("FailedOperation.TemplateAlreadyPassedCheck", "此模板已经通过审核，无法再次进行修改"),
    FAILED_OPERATION_TEMPLATE_INCORRECT_OR_UNAPPROVED("FailedOperation.TemplateIncorrectOrUnapproved", "模板未审批或内容不匹配"),
    FAILED_OPERATION_TEMPLATE_NUMBER_LIMIT("FailedOperation.TemplateNumberLimit", "模板个数达到最大值"),

    INTERNAL_ERROR_JSON_PARSE_FAIL("InternalError.JsonParseFail", "解析用户参数失败"),
    INTERNAL_ERROR_OTHER_ERROR("InternalError.OtherError", "其他错误"),
    INTERNAL_ERROR_REQUEST_TIME_EXCEPTION("InternalError.RequestTimeException",
            "请求发起时间不正常，通常是由于您的服务器时间与腾讯云服务器时间差异超过10分钟导致的，请核对服务器时间及API接口中的时间字段是否正常"),
    INTERNAL_ERROR_RESTAPI_INTERFACE_NOT_EXIST("InternalError.RestApiInterfaceNotExist",
            "不存在该REST API接口，请核查REST API接口说明"),
    INTERNAL_ERROR_SEND_AND_RECVFAIL("InternalError.SendAndRecvFail", "查REST API接口说明"),
    INTERNAL_ERROR_SIG_FIELD_MISSING("InternalError.SigFieldMissing", "接口超时或后短信收发包超时，请检查您的网络是否有波动"),
    INTERNAL_ERROR_SIG_VERIFICATION_FAIL("InternalError.SigVerificationFail", "后端包体中请求包体没有Sig字段或Sig为空"),
    INTERNAL_ERROR_TIMEOUT("InternalError.Timeout", "后端校验Sig失败"),
    INTERNAL_ERROR_UNKNOWN_ERROR("InternalError.UnknownError", "请求下发短信超时"),

    INVALID_PARAMETER_APPID_AND_BIZ_ID("InvalidParameter.AppidAndBizId", "账号与应用id不匹配"),
    INVALID_PARAMETER_DIRTY_WORD_FOUND("InvalidParameter.DirtyWordFound", "存在敏感词"),
    INVALID_PARAMETER_INVALID_PARAMETERS("InvalidParameter.InvalidParameters", "International或者SmsType参数有误"),
    INVALID_PARAMETER_BEGIN_TIME_VERIFY_FAIL("InvalidParameterValue.BeginTimeVerifyFail", "参数BeginTime校验失败"),
    INVALID_PARAMETER_CONTENT_LENGTH_LIMIT("InvalidParameterValue.ContentLengthLimit", "请求的短信内容太长"),
    INVALID_PARAMETER_END_TIME_VERIFY_FAIL("InvalidParameterValue.EndTimeVerifyFail", "参数EndTime校验失败"),
    INVALID_PARAMETER_VALUE_IMAGE_INVALID("InvalidParameterValue.ImageInvalid", "上传的转码图片格式错误"),
    INVALID_PARAMETER_VALUE_INCORRECT_PHONE_NUMBER("InvalidParameterValue.IncorrectPhoneNumber", "手机号格式错误"),
    INVALID_PARAMETER_VALUE_INVALID_DOCUMENT_TYPE("InvalidParameterValue.InvalidDocumentType", "DocumentType字段校验错误"),
    INVALID_PARAMETER_VALUE_INVALID_INTERNATIONAL("InvalidParameterValue.InvalidInternational", "International字段校验错误"),
    INVALID_PARAMETER_VALUE_INVALID_SIGN_PURPOSE("InvalidParameterValue.InvalidSignPurpose", "SignPurpose字段校验错误"),
    INVALID_PARAMETER_VALUE_INVALID_START_TIME("InvalidParameterValue.InvalidStartTime", "无效的拉取起始/截止时间"),
    INVALID_PARAMETER_VALUE_INVALID_TEMPLATE_FORMAT("InvalidParameterValue.InvalidTemplateFormat", "模板格式错误"),
    INVALID_PARAMETER_VALUE_INVALID_USED_METHOD("InvalidParameterValue.InvalidUsedMethod", "UsedMethod字段校验错误"),
    INVALID_PARAMETER_VALUE_LIMIT_VERIFY_FAIL("InvalidParameterValue.LimitVerifyFail", "参数Limit校验失败"),
    INVALID_PARAMETER_VALUE_OFFSET_VERIFY_FAIL("InvalidParameterValue.OffsetVerifyFail", "参数Offset校验失败"),
    INVALID_PARAMETER_VALUE_PROHIBITED_USE_URL_IN_TEMPLATE_PARAMETER(
            "InvalidParameterValue.ProhibitedUseUrlInTemplateParameter", "禁止在模板变量中使用 URL"),
    INVALID_PARAMETER_VALUE_SDK_APPID_NOT_EXIST("InvalidParameterValue.SdkAppIdNotExist", "SdkAppId不存在"),
    INVALID_PARAMETER_VALUE_SIGN_ALREADY_PASSED_CHECK("InvalidParameterValue.SignAlreadyPassedCheck",
            "此签名已经通过审核，无法再次进行修改"),
    INVALID_PARAMETER_VALUE_SIGN_EXIST_AND_UNAPPROVED("InvalidParameterValue.SignExistAndUnapproved", "已存在相同的待审核签名"),
    INVALID_PARAMETER_VALUE_TEMPLATE_PARAMETER_FORMAT_ERROR("InvalidParameterValue.TemplateParameterFormatError",
            "验证码模板参数格式错误"),
    INVALID_PARAMETER_VALUE_TEMPLATE_PARAMETER_LENGTH_LIMIT("InvalidParameterValue.TemplateParameterLengthLimit",
            "单个模板变量字符数超过12个，企业认证用户不限制单个变量值字数，您可以 变更实名认证模式，变更为企业认证用户后，该限制变更约1小时左右生效"),
    INVALID_PARAMETER_VALUE_TEMPLATE_WITH_DIRTY_WORDS("InvalidParameterValue.TemplateWithDirtyWords", "模板内容存在敏感词"),

    LIMIT_EXCEEDED_APP_DAILY_LIMIT("LimitExceeded.AppDailyLimit", "业务短信日下发条数超过设定的上限，可自行到控制台调整短信频率限制策略"),
    LIMIT_EXCEEDED_DAILY_LIMIT("LimitExceeded.DailyLimit", "业务短信日下发条数超过设定的上限，可自行到控制台调整短信频率限制策略"),
    LIMIT_EXCEEDED_DELIVERY_FREQUENCY_LIMIT("LimitExceeded.DeliveryFrequencyLimit", "业务短信日下发条数超过设定的上限"),
    LIMIT_EXCEEDED_PHONE_NUMBER_COUNT_LIMIT("LimitExceeded.PhoneNumberCountLimit", "业务短信日下发条数超过设定的上限"),
    LIMIT_EXCEEDED_PHONE_NUMBER_ONE_HOUR_LIMIT("LimitExceeded.PhoneNumberOneHourLimit", "单个手机号1小时内下发短信条数超过设定的上限"),
    LIMIT_EXCEEDED_PHONE_NUMBER_SAME_CONTENT_DAILY_LIMIT("LimitExceeded.PhoneNumberSameContentDailyLimit",
            "单个手机号下发相同内容超过设定的上限"),
    LIMIT_EXCEEDED_PHONE_NUMBER_THIRTY_SECOND_LIMIT("LimitExceeded.PhoneNumberThirtySecondLimit",
            "单个手机号30秒内下发短信条数超过设定的上限"),

    MISSING_PARAMETER_EMPTY_PHONE_NUMBER_SET("MissingParameter.EmptyPhoneNumberSet", "传入的号码列表为空"),

    UNAUTHORIZED_OPERATION_INDIVIDUAL_USER_MARKETING_SMS_PERMISSION_DENY(
            "UnauthorizedOperation.IndividualUserMarketingSmsPermissionDeny", "个人用户没有发营销短信的权限"),
    UNAUTHORIZED_OPERATION_REQUEST_IP_NOTIN_WHITE_LIST("UnauthorizedOperation.RequestIpNotInWhitelist",
            "请求IP不在白名单中，您配置了校验请求来源IP，但是检测到当前请求IP不在配置列表中"),
    UNAUTHORIZED_OPERATION_REQUEST_PERMISSION_DENY("UnauthorizedOperation.RequestPermissionDeny", "请求没有权限"),
    UNAUTHORIZED_OPERATION_SDK_APPID_IS_DISABLED("UnauthorizedOperation.SdkAppIdIsDisabled", "此 SdkAppId禁止提供服务"),

    UNSUPPORTED_OPERATION("UnsupportedOperation.", "不支持该请求"),
    UNSUPPORTED_OPERATION_CONTAIN_DOMESTIC_AND_INTERNATIONAL_PHONE_NUMBER(
            "UnsupportedOperation.ContainDomesticAndInternationalPhoneNumber", "群发请求里既有国内手机号也有国际手机号"),
    UNSUPPORTED_OPERATION_UN_SUPPORTED_REGION("UnsupportedOperation.UnsuportedRegion", "不支持该地区短信下发");

    private final String code;

    private final String info;

    public static BusinessError getByCode(String code) {
        for (BusinessError error : BusinessError.values()) {
            if (StrUtil.equals(code, error.getCode())) {
                return error;
            }
        }
        return null;
    }

}