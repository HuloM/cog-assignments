package com.cogent.week02.day10.java8_features;

public interface Drawable {
    default void draw() {
        System.out.println("drawable interface's draw method");
    }

    default void drawInQuotes() {
        System.out.println("drawable interfaces draw in quotes");
    }

    static Unit getStandardUnit() {
        return Unit.pixel;
    }
}

enum Unit {
    pixel,
    inch,
    millimeter,
}