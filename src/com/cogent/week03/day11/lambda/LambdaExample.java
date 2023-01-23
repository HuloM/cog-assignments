package com.cogent.week03.day11.lambda;

public class LambdaExample {
    public static void main(String[] args) {
        FuncInterface obj = () -> System.out.println("display");
        obj.method1();
    }
}

@FunctionalInterface
interface FuncInterface {
    void method1();
}
