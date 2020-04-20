package com.vidifa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Lin Liangkun
 * @Date: 2020/4/20
 */

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello,spring boot";
    }
}
