package com.example.apidemo.service;

import org.springframework.stereotype.Service;

@Service
public class EnglishGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "Hello World!";
    }
}

