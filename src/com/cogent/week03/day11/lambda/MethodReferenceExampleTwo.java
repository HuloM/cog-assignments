package com.cogent.week03.day11.lambda;

public class MethodReferenceExampleTwo {
    public void myMethod1(int i) {
        System.out.println(i);
    }
    public static void main(String[] args) {
        InterfaceB f = i -> System.out.println(i);
        f.method1(400);

        MethodReferenceExampleTwo obj = new MethodReferenceExampleTwo();
        InterfaceB f2 = i -> obj.myMethod1(i);
        f2.method1(200);
    }

}

interface InterfaceB {
    void method1(int i);
}