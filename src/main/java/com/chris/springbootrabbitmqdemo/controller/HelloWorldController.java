/*
 * Copyright (c) 201 3 , FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.chris.springbootrabbitmqdemo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller //@RestController = @ResponseBody ＋ @Controller
@RestController
public class HelloWorldController {
    /**
     * 返回模板页面
     */
    @RequestMapping("/templatesTest")
    public String templatesTest(Model map) {
        map.addAttribute("host", "https://github.com/qq5525501ew");
        //返回的模板页名称
        return "index";
    }

    @RequestMapping("/")
    public String test() {
        return "sucess";
    }
}