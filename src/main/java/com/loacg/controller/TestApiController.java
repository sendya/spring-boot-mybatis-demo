package com.loacg.controller;

import com.loacg.annotation.ApiVersion;
import com.loacg.entity.Data;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project: spring-boot-mybatis
 * Author: Sendya <18x@loacg.com>
 * Date: 2017/4/19 15:01
 */
@RestController
@RequestMapping("/api/{version}/test")
public class TestApiController {

    @RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiVersion(1)
    public Data hello() {
        return new Data().setMessage("hello, this api version: 1").setError(0);
    }

    @RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiVersion(2)
    public Data hello2() {
        return new Data().setMessage("hello, this api version: 2").setError(0);
    }

    @RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiVersion(3)
    public Data hello3() {
        return new Data().setMessage("hello, this api version: 3").setError(0);
    }




}
