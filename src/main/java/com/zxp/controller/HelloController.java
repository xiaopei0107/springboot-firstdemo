package com.zxp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam(value = "username") String username,
                           HttpServletRequest request){
        return "hello,"+username;
    }

    @RequestMapping("/testHello")
    public String testHello(@RequestParam(value = "username") String username,
                           HttpServletRequest request){
        return "testHello,springboot"+username;
    }
}
