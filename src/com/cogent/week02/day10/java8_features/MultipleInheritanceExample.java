package com.cogent.week02.day10.java8_features;

public class MultipleInheritanceExample implements InterfaceOne, InterfaceTwo {
    @Override
    public void draw() {
        InterfaceOne.super.draw();
        InterfaceTwo.super.draw();
    }

    public static void main(String[] args) {
        MultipleInheritanceExample obj = new MultipleInheritanceExample();
        obj.draw();
    }
}
