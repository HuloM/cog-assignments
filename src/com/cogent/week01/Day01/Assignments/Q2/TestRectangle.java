package com.cogent.week01.Day01.Assignments.Q2;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);
        Rectangle r3 = new Rectangle(3, 2);
        Rectangle r4 = new Rectangle(8, 19);
        Rectangle r5 = new Rectangle(4, 5);

        System.out.println("r1 area: " + r1.area());
        System.out.println("r2 area: " + r2.area());
        System.out.println("r3 area: " + r3.area());
        System.out.println("r4 area: " + r4.area());
        System.out.println("r5 area: " + r5.area());

        r5.setLength(10);
        System.out.println("r5 new area: " + r5.area());

        r1.setLength(4);
        r1.setWidth(8);
        System.out.println("r1 new area: " + r1.area());
    }
}
