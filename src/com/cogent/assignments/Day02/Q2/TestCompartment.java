package com.cogent.assignments.Day02.Q2;

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] train = new Compartment[10];

        for (int i = 0; i < 10; i++) {
            int compartment = (int) Math.floor(Math.random()*4);
            switch (compartment) {
                case 0 -> train[i] = new FirstClass();
                case 1 -> train[i] = new Ladies();
                case 2 -> train[i] = new General();
                case 3 -> train[i] = new Luggage();
                default -> System.out.println("unexpected error");
            }
        }
        for(Compartment compartment: train) {
            compartment.notice();
            System.out.println("this compartment is a " + compartment.getClass().getSimpleName());
            System.out.println("");
        }
    }
}
