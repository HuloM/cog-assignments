package com.cogent.week01.day05;

public class Day05 {
    public static void main(String[] args) {
        Person person = new Person("john", 42, 150.4);
        System.out.println(person.toString());

        A a = new A();
        B b = new B();
    }
}
// ? constructors for initializing missing fields
class Person {
    String name;
    int age;
    double weight;

    public Person() {
        this("no name", 1, 1.0);
    }

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Person(String name, int age) {
        this(name, age, 0.0);
    }

    public Person(String name) {
        this(name, 0, 0.0);
    }

    @Override
    public String toString() {
        return "Person { " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                " }";
    }
}

class A {
    double j;
    int i;

    {
        System.out.println("IIB A");
    }
    {
        System.out.println("IIB a2");

    }
    public A() {
    }

    public A(double j, int i) {
        this.j = j;
        this.i = i;
    }

    public A(double j) {
        this(j, 0);
    }

    public A(int i) {
        this(0.0, i);
    }
}

class B extends A {
    {
        System.out.println("IIB B");
    }

    B() {
        System.out.println("DC B");
    }
}