package com.example.warehouse.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.handler.HandlerResolver;
import java.io.IOException;

/**
 * @Description TODO
 * @Author yelihu
 **/
//@Order(value = Ordered.HIGHEST_PRECEDENCE)
//@Component
//public class CustomerHandlerExceptionResolver implements HandlerExceptionResolver {
//    @Override
//    public ModelAndView resolveException(HttpServletRequest request,
//                                         HttpServletResponse response,
//                                         Object o,
//                                         Exception e) {
//        try {
//            response.sendError(512,"我喜欢的错误");
//        } catch (IOException ioException) {
//            ioException.printStackTrace();
//        }
//        return new ModelAndView();
//    }
//}
