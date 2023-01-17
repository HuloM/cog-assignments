package com.cogent.week01.Day01.Assignments.Q12;

public class TestComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex(5, 6);
        System.out.println(c1.display());


        Complex c2 = new Complex();
        System.out.println(c2.display());

        System.out.println(c1.addComplexNumbers(c2));
        System.out.println(c1.subtractComplexNumbers(c2));

        System.out.println(c2.addComplexNumbers(c1));
        System.out.println(c2.subtractComplexNumbers(c1));
    }
}
