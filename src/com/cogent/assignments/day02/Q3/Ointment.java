package com.cogent.assignments.day02.Q3;

public class Ointment extends Medicine {

    public Ointment(String name, String address) {
        super(name, address);
    }

    void displayLabel() {
        super.displayLabel();
        System.out.println("for external use only");
    }
}
