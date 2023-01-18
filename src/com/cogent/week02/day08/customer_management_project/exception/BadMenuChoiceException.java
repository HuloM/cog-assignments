package com.cogent.week02.day08.customer_management_project.exception;

public class BadMenuChoiceException extends Exception{
    public BadMenuChoiceException() {
        super("There was a bad input for choice please choose from 1-4");
    }
}
