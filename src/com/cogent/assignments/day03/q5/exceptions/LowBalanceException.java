package com.cogent.assignments.day03.q5.exceptions;

public class LowBalanceException extends Exception {
    public LowBalanceException() {
        super("Your balance is low");
    }

    public LowBalanceException(String message) {
        super(message);
    }
}
