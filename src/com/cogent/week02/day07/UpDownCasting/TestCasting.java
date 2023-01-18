package com.cogent.week02.day07.UpDownCasting;

public class TestCasting {
    public static void main(String[] args) {

        Cat cat = new Cat();

        //up casting
        Animal cat2 = new Cat();

        cat.eat();
        cat.meow();
        cat.move();
        cat2.move();


        // down casting
        Animal animal = new Cat();
        Cat cat3 = (Cat)animal;

        cat3.eat();
        cat3.meow();

    }
}
