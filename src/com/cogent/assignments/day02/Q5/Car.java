package com.cogent.assignments.day02.Q5;

public class Car {
    int speed;
    int noOfGear;

    public void drive(int speed, int noOfgear) {
        this.speed = speed;
        this.noOfGear = noOfgear;
    }

    public void display() {
        System.out.println("The car is currently in gear: " + this.noOfGear +
                " and is going " + this.speed + " MPH");
    }
}
