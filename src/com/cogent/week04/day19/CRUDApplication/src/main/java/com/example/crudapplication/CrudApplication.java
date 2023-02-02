package com.example.crudapplication;

import com.example.crudapplication.employee.dao.EmployeeDAO;
import com.example.crudapplication.employee.model.Employee;
import com.example.crudapplication.employee.util.EmployeeUtil;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class CrudApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        EmployeeDAO employeeDAO = (EmployeeDAO) context
                .getBean("employeeDAO");

        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        while (choice < 5) {
            printMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    Employee employee = EmployeeUtil.createEmployee();
                    employeeDAO.create(employee);
                }
                case 2 -> employeeDAO.read();
                case 3 -> {
                    System.out.println("Enter employee id to update: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    Employee employee1 = EmployeeUtil.updateEmployee(id);
                    employeeDAO.update(employee1);
                }
                case 4 -> {
                    System.out.println("Enter employee id to delete: ");
                    int id1 = scanner.nextInt();
                    scanner.nextLine();
                    employeeDAO.delete(id1);
                }
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static void printMenu() {
        System.out.println("1. Create Employee");
        System.out.println("2. Read Employee");
        System.out.println("3. Update Employee");
        System.out.println("4. Delete Employee");
        System.out.println("5. exit");
    }
}
