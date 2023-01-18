package com.cogent.week02.day08.exceptions_practice;

public class throws_example {
    public static void main(String[] args) throws ClassNotFoundException {
        test();
    }

    public static void test() throws ClassNotFoundException {
        Class.forName("com.cogent.week02.day08.Day08");
    }

}
