package com.example.demo2.controller;


import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Login {
    @RequestMapping("login")
    public String login(@RequestParam("username") String username,@RequestParam("password") String password){
        if (StringUtils.equals(username,"hx") && StringUtils.equals(password,"123") ){
            return "redirect:https://www.baidu.com";
        }else {
            return  "";
        }
    }
}
