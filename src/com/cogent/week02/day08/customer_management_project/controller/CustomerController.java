package com.cogent.week02.day08.customer_management_project.controller;

import com.cogent.week02.day08.customer_management_project.exception.BadMenuChoiceException;
import com.cogent.week02.day08.customer_management_project.exception.CustomerIdNotFoundException;
import com.cogent.week02.day08.customer_management_project.exception.NoCustomersExistException;
import com.cogent.week02.day08.customer_management_project.service.CustomerService;

import java.util.Scanner;

public class CustomerController {

    CustomerService service = new CustomerService();

    public CustomerController() {
        this.service = new CustomerService();
    }

    public void accept(int choice) {
        try {
            switch (choice) {
                case 1 -> this.service.save();
                case 2 -> this.service.fetch();
                case 3 -> this.service.modify(getCustomerId());
                case 4 -> this.service.remove(getCustomerId());
                case 5 -> this.service.findYoungestCustomer();
                case 6 -> this.service.findCustomerById(getCustomerId());
                case 7 -> { break; }
                default -> throw new BadMenuChoiceException();
            }

        } catch (BadMenuChoiceException | CustomerIdNotFoundException | NoCustomersExistException e) {
            System.out.println(e.getMessage());
        }
    }

    private int getCustomerId() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the customer Id");

        return sc.nextInt();
    }
}
