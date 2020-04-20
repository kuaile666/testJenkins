package com.vidifa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Lin Liangkun
 * @Date: 2020/4/20
 */
@RestController
public class TestUpdateController {
    @RequestMapping("/update")
    public String hello() {
        return "hello,update success";
    }

    @RequestMapping("/update2")
    public String hello2() {
        return "hello,update success";
    }
}
