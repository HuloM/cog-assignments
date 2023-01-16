package com.cogent.week01.Day03.EmployeeManagement;

import java.util.Scanner;

public class EmployeeManagementApp {

    static Employee[] employees;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1 - Create New Employee");
            System.out.println("2 - Read All Employee Files");
            System.out.println("3 - Update Employee Record");
            System.out.println("4 - Delete Employee Record");
            System.out.println("5 - Exit Program");
            System.out.println("Please enter a number");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Please enter the number of records you would like to create");
                    int size = scanner.nextInt();

                    employees = new Employee[size];
                    EmployeeDAO.create(employees);
                    break;
                case 2:
                    EmployeeDAO.read(employees);
                    break;
                case 3:
                    System.out.println("Please enter the employee file index you would like to update");
                    int index = scanner.nextInt();
                    if (index > employees.length) {
                        System.out.println("That file does not exist");
                        break;
                    }
                    EmployeeDAO.update(index - 1, employees);
                    break;
                case 4:
                    System.out.println("Please enter the employee file index you would like to update");
                    index = scanner.nextInt();
                    if (index > employees.length) {
                        System.out.println("That file does not exist");
                        break;
                    }
                    EmployeeDAO.delete(index - 1, employees);
                    break;
                default:
                    System.out.println("program will now close");
                    break;
            }
        } while (choice < 5);
    }
}
