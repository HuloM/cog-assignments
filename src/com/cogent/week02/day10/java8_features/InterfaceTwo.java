package com.cogent.week02.day10.java8_features;

public interface InterfaceTwo {
    default void draw() {
        System.out.println("test2");
    }
}
