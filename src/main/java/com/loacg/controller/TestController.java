package com.loacg.controller;

import com.loacg.entity.Data;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Project: spring-boot-mybatis
 * Author: Sendya <18x@loacg.com>
 * Date: 2017/4/19 15:01
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Data hello(String name) {
        return new Data().setMessage("hello, " + name).setError(0);
    }

}
