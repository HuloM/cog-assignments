package com.cogent.week02.day08.exceptions_practice;

public class throw_example {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }
}
