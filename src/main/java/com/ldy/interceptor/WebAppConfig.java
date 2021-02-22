package com.ldy.interceptor;

import com.ldy.web.sss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Description: Web配置
 * @Data: 2020/12/16 10:47
 */
@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {

//
//    @Bean
//    public TicketInterceptor ticketInterceptor() {
//        return new TicketInterceptor();
//    }

    @Autowired
    sss ticketInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //ticket验证
//        registry.addInterceptor(ticketInterceptor).addPathPatterns("/**").excludePathPatterns("/doc.html", "/swagger-ui.html/**","/webjars/**", "/swagger-resources/**")
//                .excludePathPatterns("/v2/api-docs")
//                .excludePathPatterns("/**/favicon.ico");

    }

}
