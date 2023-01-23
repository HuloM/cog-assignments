package com.cogent.assignments.day03.q2;

import com.cogent.assignments.day03.q2.esg.itp.shape.Rectangle;
import com.cogent.assignments.day03.q2.esg.itp.shape.Square;

public class ShapeTest {
    public static void main(String[] args) {
        Square s = new Square(2);

        s.calcPeri();
        System.out.println();
        s.calcArea();
        System.out.println();
        s.display();

        Rectangle r = new Rectangle(10, 5);

        System.out.println();
        r.calcArea();
        System.out.println();
        r.calcPeri();
        System.out.println();
        r.display();
    }
}
