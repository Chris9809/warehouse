//package com.example.warehouse.config;
//
//import com.example.warehouse.servlet.MyFilter;
//import com.example.warehouse.servlet.MyServlet;
//import com.example.warehouse.servlet.MySevletContextListener;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Arrays;
//
///**
// * @Description TODO
// * @Author yelihu
// **/
////@Configuration(proxyBeanMethods = false) 不这样写，始终保证依赖的组件是单例的，避免heap里面过多重复对象
//@Configuration
//public class MyRegistryConfig {
//
//    @Bean
//    public ServletRegistrationBean mySerlet(){
//        MyServlet servlet = new MyServlet();
//        return new ServletRegistrationBean(servlet,"/my","/my02");
//    }
//
//    @Bean
//    public FilterRegistrationBean myFilter(){
//        MyFilter filter = new MyFilter();
//        FilterRegistrationBean bean = new FilterRegistrationBean(filter);
//        bean.setUrlPatterns(Arrays.asList("/my","/css/*"));
//        return bean;
//    }
//
//    @Bean
//    public ServletListenerRegistrationBean myListener(){
//        MySevletContextListener listener = new MySevletContextListener();
//        return new ServletListenerRegistrationBean(listener);
//    }
//}
