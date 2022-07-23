package com.qcloud.sms.response.error.enums;

import cn.hutool.core.util.StrUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 公共错误 <a href="https://cloud.tencent.com/document/product/382/52075">参考地址</a>
 *
 * @author xm.z
 */
@Getter
@AllArgsConstructor
public enum PublicError {

    ACTION_OFFLINE("ActionOffline", "接口已下线"),
    AUTH_FAILURE_INVALID_AUTHORIZATION("AuthFailure.InvalidAuthorization", "请求头部的 Authorization 不符合腾讯云标准"),
    AUTH_FAILURE_MFA_FAILURE("AuthFailure.MFAFailure", "MFA 错误"),
    AUTH_FAILURE_SECRET_ID_NOTFOUND("AuthFailure.SecretIdNotFound",
            "密钥不存在。请在控制台检查密钥是否已被删除或者禁用，如状态正常，请检查密钥是否填写正确，注意前后不得有空格"),
    AUTH_FAILURE_SIGNATURE_EXPIRE("AuthFailure.SignatureExpire", "签名过期。Timestamp和服务器时间相差不得超过五分钟，请检查本地时间是否和标准时间同步"),
    AUTH_FAILURE_SIGNATURE_FAILURE("AuthFailure.SignatureFailure", "签名错误。签名计算错误，请对照调用方式中的签名方法文档检查签名计算过程"),
    AUTH_FAILURE_TOKEN_FAILURE("AuthFailure.TokenFailure", "token 错误"),
    AUTH_FAILURE_UNAUTHORIZED_OPERATION("AuthFailure.UnauthorizedOperation", "请求未授权"),
    DRY_RUN_OPERATION("DryRunOperation", "DryRun 操作，代表请求将会是成功的，只是多传了 DryRun 参数"),
    FAILED_OPERATION("FailedOperation", "操作失败"), INTERNAL_ERROR("InternalError", "请求未授权"),
    INVALID_ACTION("InvalidAction", "接口不存在"), INVALID_PARAMETER("InvalidParameter", "参数错误"),
    INVALID_PARAMETER_VALUE("InvalidParameterValue", "请求 body 的 multipart 格式错误"),
    INVALID_REQUEST("InvalidRequest", "超过配额限制"), MISSING_PARAMETER("MissingParameter", "缺少参数"),
    NO_SUCH_PRODUCT("NoSuchProduct", "产品不存在"), NO_SUCH_VERSION("NoSuchVersion", "接口版本不存在"),
    REQUEST_LIMIT_EXCEEDED("RequestLimitExceeded", "请求的次数超过了频率限制"),
    REQUEST_SIZE_LIMIT_EXCEEDED("RequestSizeLimitExceeded", "请求包超过限制大小"), RESOURCE_INUSE("ResourceInUse", "资源被占用"),
    RESOURCE_INSUFFICIENT("ResourceInsufficient", "资源不足"), RESOURCE_NOTFOUND("ResourceNotFound", "资源不存在"),
    RESOURCE_UNAVAILABLE("ResourceUnavailable", "资源不可用"), SERVICE_UNAVAILABLE("ServiceUnavailable", "当前服务暂时不可用"),
    UNAUTHORIZED_OPERATION("UnauthorizedOperation", "未授权操作"),
    UNKNOWN_PARAMETER("UnknownParameter", "未知参数错误，用户多传未定义的参数会导致错误"),
    UNSUPPORTED_OPERATION("UnsupportedOperation", "操作不支持"),
    UNSUPPORTED_PROTOCOL("UnsupportedProtocol", "http(s) 请求协议错误，只支持 GET 和 POST 请求"),
    UNSUPPORTED_REGION("UnsupportedRegion", "接口不支持所传地域");

    private final String code;

    private final String info;

    public static PublicError getByCode(String code) {
        for (PublicError error : PublicError.values()) {
            if (StrUtil.equals(code, error.getCode())) {
                return error;
            }
        }
        return null;
    }

}