package com.cogent.assignments.day03.q5.exceptions;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("You do not have enough funds to perform this operation");
    }
}
