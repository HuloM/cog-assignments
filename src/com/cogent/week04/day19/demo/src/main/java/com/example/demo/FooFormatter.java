package com.example.demo;

import org.springframework.stereotype.Component;

@Component("fooFormatter")
public class FooFormatter implements Formatter {
    public String format() {
        return "Foo";
    }
}
