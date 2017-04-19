package com.loacg.annotation;

import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.*;

/**
 * Project: spring-boot-mybatis
 * Author: Sendya <18x@loacg.com>
 * Date: 2017/4/19 14:44
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface ApiVersion {

    /**
     * version number
     * @return int
     */
    int value();

}
