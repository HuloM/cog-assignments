package com.cogent.assignments.day03.q2.esg.itp.shape;

public class Rectangle implements Polygon{
    float length;
    float breadth;

    public Rectangle(float len, float bre) {
        this.length = len;
        this.breadth = bre;
    }


    @Override
    public void calcArea() {
        System.out.print(this.length * this.breadth);
    }

    @Override
    public void calcPeri() {
        System.out.print((this.length + this.breadth) * 2);
    }

    @Override
    public void display() {
        System.out.print("the area is: ");
        calcArea();
        System.out.print("\nthe perimeter is: ");
        calcPeri();
    }
}
