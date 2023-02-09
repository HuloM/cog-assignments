package com.example.onetooneexercisep2;

import com.example.onetooneexercisep2.entity.Employee;
import com.example.onetooneexercisep2.entity.EmployeeContact;
import com.example.onetooneexercisep2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@SpringBootApplication
public class OneToOneExerciseP2Application implements CommandLineRunner {
    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(OneToOneExerciseP2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee();
        employee.setEmployeeName("John");

        Set<EmployeeContact> employeeContacts = new HashSet<>();

        EmployeeContact employeeContact = new EmployeeContact();
        employeeContact.setPhoneNumber("1234567890");

        EmployeeContact employeeContact2 = new EmployeeContact();
        employeeContact2.setPhoneNumber("1234567891");

        EmployeeContact employeeContact3 = new EmployeeContact();
        employeeContact3.setPhoneNumber("1234567892");

        employeeContacts.add(employeeContact);
        employeeContacts.add(employeeContact2);
        employeeContacts.add(employeeContact3);

        employee.setEmployee_contacts(employeeContacts);

        employeeRepository.save(employee);
        System.out.println("Employee saved successfully");

    }
}
