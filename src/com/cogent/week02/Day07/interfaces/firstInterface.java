package com.cogent.week02.Day07.interfaces;

public interface firstInterface {
    int n = 0;
    void test();
    default void test2() {
        System.out.println("test2");
    }
    static void test3() {
        System.out.println("test3");
    }
    private static void test4() {
        System.out.println("test4");
    }
    private void test5() {
        System.out.println("test5");
    }
}


