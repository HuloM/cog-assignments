package com.cogent.assignments.Day02.Q3;

public class Syrup extends Medicine{
    public Syrup(String name, String address) {
        super(name, address);
    }

    void displayLabel() {
        super.displayLabel();
        System.out.println("only use recommended dose 1-2 times per day");
    }
}
