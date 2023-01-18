package com.cogent.week02.day08.customer_management_project.exception;

public class NoCustomersExistException extends Exception {
    public NoCustomersExistException() {
        super("there are currently no customers stored in the database");
    }
}
