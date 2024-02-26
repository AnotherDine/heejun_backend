package com.example.heejun_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/testCors")
    public String testCors() {
        return "연결 잘됐다 ~~~";
    }
}
