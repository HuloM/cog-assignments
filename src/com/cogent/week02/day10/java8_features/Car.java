package com.cogent.week02.day10.java8_features;

public class Car implements Vehicle{

    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String speedUp() {
        return "Car is speeding up";
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public String slowDown() {
        return "Car is slowing down";
    }

    public static void main(String[] args) {
        Vehicle car = new Car("BMW");
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff ());
    }
}
