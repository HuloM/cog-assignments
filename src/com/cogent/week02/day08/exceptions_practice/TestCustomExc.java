package com.cogent.week02.day08.exceptions_practice;

class CustomException extends Exception{
    public CustomException() {
        super("this is a custom exception");
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomException(Throwable cause) {
        super(cause);
    }

    public CustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

public class TestCustomExc {
    public static void main(String[] args) throws CustomException {
        throw new CustomException("testing custom exception message");
    }
}