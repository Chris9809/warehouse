package com.example.warehouse.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Description 全局异常处理类
 * @Author yelihu
 **/
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = {ArithmeticException.class,NullPointerException.class})
    public String handleArithException(Exception e){
        log.error("异常是：",e);
        return "error/math";
    }
}
