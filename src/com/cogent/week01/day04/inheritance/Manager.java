package com.cogent.week01.day04.inheritance;

public class Manager {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.drink();

        Cat cat = new Cat();
        cat.drink();
        cat.eat();

        Dog dog = new Dog();
        dog.drink();

        Animal animal1 = new Cat();
        animal1.drink();

        Tiger tiger = new Tiger();
        tiger.drink();
        tiger.eat();
    }
}

class Animal {
    void drink() {
        System.out.println("drinks water");
    }
}
class Dog extends Animal {}

class Cat extends Animal {
    @Override
    void drink() {
        System.out.println("drinks milk");
    }

    void eat() {
        System.out.println("eats tuna");
    }
}

class Tiger extends Cat {
    @Override
    void eat() {
        System.out.println("eats chicken");
    }
}