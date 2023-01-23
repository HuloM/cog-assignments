package com.cogent.assignments.day03.q2.esg.itp.shape;

public class Square implements Polygon {
    float side;

    public Square(float s) {
        this.side = s;
    }

    @Override
    public void calcArea() {
        System.out.print(this.side * this.side);
    }

    @Override
    public void calcPeri() {
        System.out.print(this.side * 4);
    }

    @Override
    public void display() {
        System.out.print("the area is: ");
        calcArea();
        System.out.print("\nthe perimeter is: ");
        calcPeri();
    }
}
