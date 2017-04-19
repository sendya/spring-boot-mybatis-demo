package com.loacg.bootstrap;

import com.loacg.handler.AuthRequireInterceptor;
import com.loacg.handler.CustomRequestMappingHandlerMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.WebMvcRegistrations;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * Project: spring-boot-mybatis
 * Author: Sendya <18x@loacg.com>
 * Date: 2017/4/19 14:52
 */
@Configuration
public class WebInitializer extends WebMvcConfigurerAdapter implements WebMvcRegistrations {

    private final AuthRequireInterceptor authRequireInterceptor;

    @Autowired
    public WebInitializer(AuthRequireInterceptor authRequireInterceptor) {
        this.authRequireInterceptor = authRequireInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(authRequireInterceptor).addPathPatterns("/**");
    }

    /**
     * 注册自定义 mapping
     * 用于统一管理 restful API 版本
     * @return RequestMappingHandlerMapping
     */
    @Override
    public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
        return new CustomRequestMappingHandlerMapping();
    }

    @Override
    public RequestMappingHandlerAdapter getRequestMappingHandlerAdapter() {
        return null;
    }

    @Override
    public ExceptionHandlerExceptionResolver getExceptionHandlerExceptionResolver() {
        return null;
    }
}
