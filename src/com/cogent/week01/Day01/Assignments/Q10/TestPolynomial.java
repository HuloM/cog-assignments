package com.cogent.week01.Day01.Assignments.Q10;

public class TestPolynomial {
    public static void main(String[] args) {
        Polynomial poly = new Polynomial(10);

        poly.setTerm(1,2);
        poly.setTerm(1,3);
        poly.setTerm(1,4);
        poly.setTerm(1,5);
        poly.setTerm(1,6);
        poly.setTerm(1,7);
        poly.setTerm(1,8);
        poly.setTerm(1,9);
        poly.setTerm(1,10);
        poly.setTerm(1,11);

        Polynomial poly2 = new Polynomial();

        poly2.setTerm(1,1);
        poly2.setTerm(1,2);
        poly2.setTerm(1,3);
        poly2.setTerm(1,4);
        poly2.setTerm(1,5);
    }
}
