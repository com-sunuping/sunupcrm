package com.sunuping.sunupcrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping(name = "/index")
    public String index(){
        System.out.println("sssssssssssssssssssssssss");
        return "/index";
    }
}
