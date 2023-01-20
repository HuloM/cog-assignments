package com.cogent.week01.day03.employee_management;


import java.util.Scanner;

public class EmployeeDAO {
    public static void create(Employee[] employees) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Please enter the id of employee");
            int id = scanner.nextInt();
            System.out.println("Please enter the name of employee");
            String name = scanner.next();
            System.out.println("Please enter the salary of employee");
            Double salary = scanner.nextDouble();
            employees[i] = new Employee(id, name, salary);
        }
        System.out.println("Successfully added new files");
    }

    public static void read(Employee[] employees) {
        for(Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static void delete(int index, Employee[] employees) {
        System.out.println(employees[index].getEmpName() + "'s file will now be deleted");
        employees[index] = null;
    }

    public static void update(int index, Employee[] employees) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to update the name of this employee (Y/N)?");

        boolean updateName = scanner.nextLine().equalsIgnoreCase("y");
        String empName = updateName ? scanner.nextLine() : employees[index].getEmpName();

        System.out.println("Would you like to update the salary of this employee (Y/N)?");
        boolean updateSalary = scanner.nextLine().equalsIgnoreCase("y");
        Double empSalary = updateSalary ? scanner.nextDouble() : employees[index].getEmpSalary();



        employees[index] = new Employee(index, empName, empSalary);
    }
}
