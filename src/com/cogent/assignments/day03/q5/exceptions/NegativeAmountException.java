package com.cogent.assignments.day03.q5.exceptions;

public class NegativeAmountException extends Exception {
    public NegativeAmountException() {
        super("Your current balance is negative please deposit some money");
    }
}
