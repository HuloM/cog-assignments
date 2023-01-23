package com.cogent.week02.day06.coding_assessment.mock_interview;

public class tester {
    public static void main(String[] args) {
        A a = new A();
        a.test();
        System.out.println("");
        a.nonOverride_test();

        B b = new B();
        b.test();
        System.out.println("");
        b.nonOverride_test();
    }
}
