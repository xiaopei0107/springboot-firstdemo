package com.zxp.controller;

import com.zxp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll")
    public List findAll(){
        System.out.println("findAll....");
        List list = userService.findAllUser();
        return list;
    }
}
