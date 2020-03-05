package com.javaboy.securitydy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/db/hello")
    public String hello1(){
        return "hello db";
    }
    @GetMapping("/admin/hello")
    public String hello2(){
        return "hello admin";
    }

    @GetMapping("/user/hello")
    public String hello3(){
        return "hello user";
    }
}
