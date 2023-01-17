package com.cogent.week02.Day07.abstract_classes;

public class abstract_classes {
    public static void main(String[] args) {
        Animal.test();
        Animal lion = new Lion();
        Cow cow = new Cow();
        cow.eat();
        lion.eat();
    }
}

abstract class Animal {
    Animal() {
        System.out.println("this is an animal");
    }
    void drink() {
        System.out.println("Drinks water");
    }
    abstract void eat();
    static void test() {
        System.out.println("test");
    }
}

class Cow extends Animal {

    @Override
    void eat() {
        System.out.println("eats grass");
    }
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("eats meat");
    }
}