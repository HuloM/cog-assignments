package com.cogent.week02.day07.upcasting_downcasting;

public class Animal implements Mammal{

    Animal() {

    }

    @Override
    public void move() {
        System.out.println("walks around");
    }

    @Override
    public void sleep() {
        System.out.println("Is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("is eating");
    }
}
