package org.wby.seckill.exception;

import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.wby.seckill.vo.ResultBean;
import org.wby.seckill.vo.ResultBeanEnum;

@RestControllerAdvice
public class GlobalExceptionHandle {

    @ExceptionHandler(Exception.class)
    public ResultBean ExceptionHandler(Exception e) {
        if (e instanceof GlobalException) {
            GlobalException ex = (GlobalException) e;
            return ResultBean.fail(ex.getResultBeanEnum());
        } else if(e instanceof BindException) {
            BindException bx = (BindException) e;
            ResultBean resultBean = ResultBean.fail(ResultBeanEnum.BIND_ERROR);
            resultBean.setMessage("参数校验异常："+bx.getBindingResult().getAllErrors().get(0)
                    .getDefaultMessage());
            return resultBean;
        }
        return ResultBean.fail(ResultBeanEnum.ERROR);
    }
}
