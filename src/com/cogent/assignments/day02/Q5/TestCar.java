package com.cogent.assignments.day02.Q5;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive(60, 4);
        car.display();
        System.out.println("");

        SportCar sCar = new SportCar("turbo");
        System.out.println("");
        sCar.display();

    }
}
