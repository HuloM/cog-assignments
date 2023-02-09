package org.example;

import org.example.config.BeanConfig;
import org.example.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        Employee emp = ctx.getBean(Employee.class);

        System.out.println("the employee ID is: " + emp.getEmpId());
        System.out.println("the employee name is: " + emp.getEmpName());
        System.out.println("the employee salaray is: " + emp.getEmpSal());
    }
}