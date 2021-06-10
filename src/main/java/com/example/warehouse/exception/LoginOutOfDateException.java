package com.example.warehouse.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;

/**
 * @Description TODO
 * @Author yelihu
 **/
@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "用户登录身份过期")
public class LoginOutOfDateException extends RuntimeException{
    //DispatcherServlet
    //DefaultHandlerExceptionResolver
    public LoginOutOfDateException(String message) {
        super(message);
    }
}
