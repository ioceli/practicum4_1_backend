package com.practicum.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello-1")
    public String helloAdmin(){
        return "Hello Admin";
    }    
    
    @GetMapping("/hello-2")
    public String helloUser(){
        return "Hello User";
    }    
}
