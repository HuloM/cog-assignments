package com.cogent.assignments.Day02.Q3;

public class Medicine {
    String name;
    String address;

    public Medicine(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayLabel() {
        System.out.println("The company: " + this.name +
                " can be found here: " + this.address);
    }
}
