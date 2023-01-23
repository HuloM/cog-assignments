package com.cogent.week02.day10.object_methods;

public class Rectangle {
    private int length;
    private int breadth;
    private int area;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        this.area = length * breadth;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle))
            return false;

        Rectangle rectangle = (Rectangle) o;

        return length == rectangle.length &&
                breadth == rectangle.breadth;
    }
    @Override
    public String toString() {
        return "The breadth is: " + this.breadth +
                "\nthe length is: " + this.length +
                "\nthe area is: " + this.area + "\n";
    }
}