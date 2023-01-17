package com.cogent.week02.Day07.interfaces;

public class interface_extends {

}

interface A{
    void method1();
    void method2();
}
// B now includes method1 and method2
interface B extends A{
    void method3();
}

class C extends AB implements B {
    @Override
    public void method1() {
        System.out.println("1");
    }
    @Override
    public void method2() {
        System.out.println("2");
    }
    @Override
    public void method3() {
        System.out.println("3");
    }
}

class AB {
    void test2() {
        System.out.println("test");
    }
}