package com.cogent.week02.day10.java8_features;

public class DefaultMethodInterfaceExample {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.method1();
        b.method1();

        a.method2();
        b.method2();
    }
}

interface MyInterface {
    void method1();
    default void method2() {
        System.out.println("this is a default implementation");
    }
}

class A implements MyInterface {

    @Override
    public void method1() {
        System.out.println("this is in class A");
    }
}

class B implements MyInterface {

    @Override
    public void method1() {
        System.out.println("this is in class B");
    }
}