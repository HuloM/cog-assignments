package com.cogent.week02.day10.java8_features;

public interface Vehicle {

    String speedUp();
    String getBrand();
    String slowDown();

    default String turnAlarmOn() {
        return "Car alarm is on";
    }

    default String turnAlarmOff() {
        return "Car alarm is off";
    }
}
