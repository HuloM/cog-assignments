package com.cogent.week02.day08.customer_management_project.exception;

public class CustomerIdNotFoundException extends Exception {
    public CustomerIdNotFoundException() {
        super("A customer with this Id has not been found");
    }
}
