package com.cogent.week03.day11.lambda;

public class NonLambdaExample {
    public static void main(String[] args) {
        test obj = new test();

        obj.method1();
    }
}

interface NonFuncInterface {
    void method1();
}

class test implements NonFuncInterface {

    @Override
    public void method1() {
        System.out.println("test");
    }
}