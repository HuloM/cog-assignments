package com.cogent.assignments.day01.Q4;

public class Rectangle {
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if(length < 0.0 || length > 20.0)
            return;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width < 0.0 || width > 20.0)
            return;
        this.width = width;
    }

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return this.width * this.length;
    }

    public int perimeter() {
        return (this.length * 2) + (this.width * 2);
    }
}
