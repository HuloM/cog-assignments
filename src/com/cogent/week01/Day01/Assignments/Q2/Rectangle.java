package com.cogent.week01.Day01.Assignments.Q2;

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

    public int area() {
        return this.width * this.length;
    }
}