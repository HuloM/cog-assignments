package com.cogent.week02.day10.java8_features;

public class Person implements Drawable{
    public boolean drawn() {
        return true;
    }

    @Override
    public void draw() {
        System.out.println("Person's draw method");
        Drawable.super.draw();
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.draw();
        person.drawInQuotes();
    }
}
