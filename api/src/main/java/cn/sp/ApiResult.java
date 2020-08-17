package cn.sp;

import java.io.Serializable;

public class ApiResult<T> implements Serializable {
    private static final long serialVersionUID = 5446115418395098891L;
    private Integer code;
    private String message;
    private T data;

    public static <T> ApiResult<T> success(T object) {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setCode(ResultCode.SUCCESS.getCode());
        apiResult.setMessage(ResultCode.SUCCESS.getDesc());
        apiResult.setData(object);
        return apiResult;
    }

    public static <T> ApiResult<T> error(ResultCode resultCode) {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setCode(resultCode.getCode());
        apiResult.setMessage(resultCode.getDesc());
        return apiResult;
    }

    public static <T> ApiResult<T> error(ResultCode resultCode, String message) {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setCode(resultCode.getCode());
        apiResult.setMessage(message);
        return apiResult;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
