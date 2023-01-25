package com.cogent.assignments.day03.q8;

public class IllegalValueException extends Exception {
    public IllegalValueException() {
        super("The value cannot be negative!");
    }
}
