package com.cogent.week02.day07.interfaces;

public class interface_practice {
    public static void main(String[] args) {
        C1 c = new C1();
        c.test();
        c.test2();
        c.test3();
        c.test4();

        C3 c3 = new C3();
        c3.test();
        c3.test2();
        c3.test3();
    }
}

interface Ai {
    void test();
}

interface Bi extends Ai {
    void test2();
}

interface Ci {
    void test3();
}

class C1 extends C2 implements Bi, Ci {

    @Override
    public void test() {
        System.out.println("test from c1");
    }

    @Override
    public void test2() {
        System.out.println("test 2 from c1");
    }

    @Override
    public void test3() {
        System.out.println("test 3 from c1");
    }
}

class C2 {
    void test4() {
        System.out.println("test from c2");
    }
}

class C3 implements Bi, Ci {
    @Override
    public void test() {
        System.out.println("test from c3");
    }

    @Override
    public void test2() {
        System.out.println("test 2 from c3");
    }

    @Override
    public void test3() {
        System.out.println("test 3 from c3");
    }
}