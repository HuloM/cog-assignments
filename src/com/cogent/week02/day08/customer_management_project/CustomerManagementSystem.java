package com.cogent.week02.day08.customer_management_project;

import com.cogent.week02.day08.customer_management_project.controller.CustomerController;
import com.cogent.week02.day08.customer_management_project.model.Customer;

import java.util.Scanner;

public class CustomerManagementSystem {

    public static void main(String[] args) {
        CustomerManagementSystem cms = new CustomerManagementSystem();
        CustomerController cController = new CustomerController();


        int choice= 0;
        do {
            choice = cms.printMenu();
            cController.accept(choice);

        } while (choice < 7);
    }

    int printMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****** Menu ******");
        System.out.println("1 - Add Record");
        System.out.println("2 - Read Record");
        System.out.println("3 - Update Record");
        System.out.println("4 - Delete Record");
        System.out.println("5 - Find Youngest Customer");
        System.out.println("6 - Find Customer By Id");
        System.out.println("7 - Exit");

        return scanner.nextInt();
    }
}
