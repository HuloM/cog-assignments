package com.cogent.week02.day10.java8_features;

public interface InterfaceOne {
    default void draw() {
        System.out.println("test");
    }
}
