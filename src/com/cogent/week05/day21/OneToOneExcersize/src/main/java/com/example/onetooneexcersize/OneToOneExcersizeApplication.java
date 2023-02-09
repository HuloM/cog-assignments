package com.example.onetooneexcersize;

import com.example.onetooneexcersize.entity.Department;
import com.example.onetooneexcersize.entity.Employee;
import com.example.onetooneexcersize.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneExcersizeApplication implements CommandLineRunner {
    @Autowired
    EmployeeRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(OneToOneExcersizeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee();
        employee.setEmpName("Meenakshi");

        Department department = new Department();
        department.setDeptName("IT");

        employee.setDepartment(department);
        repository.save(employee);
        System.out.println("Saved!!!");
    }
}
