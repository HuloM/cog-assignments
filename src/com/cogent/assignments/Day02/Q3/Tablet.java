package com.cogent.assignments.Day02.Q3;

public class Tablet extends Medicine {

    public Tablet(String name, String address) {
        super(name, address);
    }

    void displayLabel() {
        super.displayLabel();
        System.out.println("only use recommended dose 1-2 times per day");
    }
}
