package com.loacg.handler;

import com.loacg.annotation.AuthRequired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Project: spring-boot-mybatis
 * Author: Sendya <18x@loacg.com>
 * Date: 2017/4/19 14:54
 */
@Component
public class AuthRequireInterceptor extends HandlerInterceptorAdapter {

    private static Logger logger = LoggerFactory.getLogger(AuthRequireInterceptor.class);

    private boolean doLogin(HttpServletRequest request, HttpServletResponse response) {
        String redirectUrl = request.getContextPath() + "/auth/login";
        String requestType = request.getHeader("X-Requested-With");

        if (requestType != null && !"".equals(requestType)) {
            logger.debug("request json data");
            response.setStatus(401);
            throw new RuntimeException("Required Login");
        }

        logger.debug("send redirect: {}", redirectUrl);
        try {
            response.sendRedirect(redirectUrl);
        } catch (IOException e) {
            logger.warn("exception: {}", e.getMessage());
        }
        return false;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler.getClass().isAssignableFrom(HandlerMethod.class)) {
            AuthRequired required = ((HandlerMethod) handler).getMethodAnnotation(AuthRequired.class);

            if (required == null || !required.validate())
                return super.preHandle(request, response, handler);

            logger.info("Auth Required URI: {}", request.getRequestURI());


            return super.preHandle(request, response, handler);
        }
        return super.preHandle(request, response, handler);
    }

}
