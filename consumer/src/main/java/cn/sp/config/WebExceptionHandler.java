package cn.sp.config;

import cn.sp.ApiResult;
import cn.sp.ResultCode;
import cn.sp.rpc.common.exception.RpcException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Ship
 * @version 1.0.0
 * @description:
 * @date 2023/06/20
 */
@RestControllerAdvice
public class WebExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ApiResult<Void> handlerException(Exception exception) {
        return ApiResult.error(ResultCode.SYSTEM_ERROR);
    }

    @ExceptionHandler(RpcException.class)
    public ApiResult<Void> handlerRpcException(RpcException exception) {
        return ApiResult.error(ResultCode.SYSTEM_ERROR, exception.getMessage());
    }
}
