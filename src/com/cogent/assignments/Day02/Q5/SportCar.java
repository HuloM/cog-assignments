package com.cogent.assignments.Day02.Q5;

public class SportCar extends Car {
    String airBallonType;

    public SportCar(String airBallonType) {
        super.drive(60, 3);
        super.display();
        this.airBallonType = airBallonType;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("The air bag currently installed is: " + this.airBallonType);
    }
}
