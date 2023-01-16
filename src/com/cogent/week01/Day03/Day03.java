package com.cogent.week01.Day03;

public class Day03 {

    static int i = 10;
    public static void main(String[] args) {
        test11 obj = new test11();

        System.out.println("in main method");
        System.out.println(obj.i);
        obj.test1();

        System.out.println(test11.j);
        test11.test2();

        Day03 obj2 = new Day03();
        obj2.main2();
    }
    void main2() {
        System.out.println("\nin main2 method");
        test11 obj = new test11();
        System.out.println(obj.i);
        obj.test1();

        System.out.println(test11.j);
        test11.test2();
    }
}

class test11 {
    int i = 10;
    static int j = 20;
    void test1() {
        System.out.println("I am from test1");
    }
    static void test2() {
        System.out.println("I am from test2");
    }
}