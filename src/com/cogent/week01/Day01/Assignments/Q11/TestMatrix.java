package com.cogent.week01.Day01.Assignments.Q11;

public class TestMatrix {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(5, 5);
        m1.printMatrix();

        m1.setElement(0,1, 1);
        m1.setElement(0,2, 1);
        m1.setElement(1,1, 1);
        m1.setElement(2,1, 1);
        m1.setElement(3,1, 1);
        m1.setElement(0,3, 1);
        m1.setElement(0,5, 1);

        System.out.println("");
        m1.printMatrix();

        System.out.println("");

        Matrix m2 = m1.transpose();
        m2.printMatrix();
    }
}
