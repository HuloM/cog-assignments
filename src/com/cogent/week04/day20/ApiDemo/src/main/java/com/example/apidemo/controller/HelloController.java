package com.example.apidemo.controller;

import com.example.apidemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

        @Autowired
        GreetingService greetingService;

        @RequestMapping("/hello")
        public String hello() {
            return "Hello World!";
        }
}
