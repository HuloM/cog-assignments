package com.example.crudapplication.employee.util;

import com.example.crudapplication.employee.model.Employee;

import java.util.Scanner;

public class EmployeeUtil {
    Scanner scanner = new Scanner(System.in);
    public static Employee createEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee id: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.println("Enter employee age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter employee salary: ");
        int salary = scanner.nextInt();
        scanner.nextLine();
        return new Employee(employeeId, name, age, salary);
    }

    public static Employee updateEmployee(int id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.println("Enter employee age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter employee salary: ");
        int salary = scanner.nextInt();
        scanner.nextLine();
        return new Employee(id, name, age, salary);
    }
}
