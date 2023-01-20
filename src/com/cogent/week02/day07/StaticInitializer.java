package com.cogent.week02.day07;

public class StaticInitializer {
    static {
        System.out.println("static initializer");
    }
    public static void main(String[] args) {
        System.out.println("start");
        B b = new B();
        A a = new A();
        System.out.println("end");
    }
}

class A {

    A() { System.out.println("A constructor"); }

    { System.out.println("A initializer"); }

    static { System.out.println("A static initializer"); }
    void test() { System.out.println("A test"); }
}

class B extends A{
    B() { System.out.println("B constructor"); }

    { System.out.println("B initializer"); }

    static { System.out.println("B staic initializer"); }

    public void test() { System.out.println("B test"); }
}