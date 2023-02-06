package com.example.demo;

import org.springframework.stereotype.Component;

@Component("barFormatter")
public class BarFormatter implements Formatter {
    public String format() {
        return "Bar";
    }
}
