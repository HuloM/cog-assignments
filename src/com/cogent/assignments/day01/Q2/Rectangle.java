package com.cogent.assignments.day01.Q2;

import java.util.Objects;

public class Rectangle {
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle))
            return false;

        Rectangle rectangle = (Rectangle) o;

        return length == rectangle.length &&
                width == rectangle.width;
    }
    @Override
    public String toString() {
        return "The Rectangles width is: " + this.width + "" +
                "\n and the length is: " + this.length;
    }

    public int area() {
        return this.width * this.length;
    }
}