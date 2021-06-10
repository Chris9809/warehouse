package com.example.warehouse.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;

/**
 * @Description TODO
 * @Author yelihu
 **/
//@Configuration
//public class MyDataSourceConfig {
//    @Bean
//    @ConfigurationProperties("spring.datasource")
//    public DataSource duridDataSource() throws SQLException {
//        return new DruidDataSource();
//    }
//    @Bean
//    public ServletRegistrationBean statViewServlet(){
//        StatViewServlet servlet = new StatViewServlet();
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean(servlet
//                , "/druid/*");
//        //registrationBean.addInitParameter("loginUsername","admin");
//        //registrationBean.addInitParameter("loginPassword","123456");
//
//        return registrationBean;
//    }

    //@Bean
    //@ConfigurationProperties("spring.datasource")
    //public DataSource duridDataSource() throws SQLException {
    //    DruidDataSource source = new DruidDataSource();
    //    //开启监控加入监控功能
    //    source.setFilters("stat,wall");
    //    return source;
    //}
    //
    ///**
    // * 配置durid的监控页面Servlet
    // * @return
    // */
    //@Bean
    //public ServletRegistrationBean statViewServlet(){
    //    StatViewServlet servlet = new StatViewServlet();
    //    ServletRegistrationBean registrationBean = new ServletRegistrationBean(servlet
    //            , "/druid/*");
    //    registrationBean.addInitParameter("loginUsername","admin");
    //    registrationBean.addInitParameter("loginPassword","123456");
    //
    //    return registrationBean;
    //}
    //
    ///**
    // * 过滤器：采集web-jdbc关联监控的数据
    // * 参考https://github.com/alibaba/druid/wiki/%E9%85%8D%E7%BD%AE_%E9%85%8D%E7%BD%AEWebStatFilter
    // * @return
    // */
    //@Bean
    //public FilterRegistrationBean webStatFilter(){
    //    WebStatFilter filter = new WebStatFilter();
    //    FilterRegistrationBean registrationBean = new FilterRegistrationBean(filter);
    //    registrationBean.setUrlPatterns(Arrays.asList("/*"));
    //    //对一下请求不拦截
    //    registrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico");
    //    return registrationBean;
    //}
//}
