package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Service {
    @Autowired
    @Qualifier("fooFormatter")
    private Formatter formatter;

    public Service() {
    }

    public String format() {
        return formatter.format();
    }
}
