package com.cogent.week03.day11.lambda;

public class LambdaParameterExample {
    public static void main(String[] args) {
        Arithmetic sum = (x, y) -> System.out.println("sum of 2 numbers is " + (x + y));
        sum.operation(2,4);
        sum.operation(2,5);

        Arithmetic multiply = (x, y) -> System.out.println("multiplication of 2 numbers is " + (x * y));
        multiply.operation(1, 5);
        multiply.operation(4, 5);
    }
}

interface Arithmetic {
    void operation(int a, int b);
}
