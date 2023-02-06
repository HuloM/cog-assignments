package com.example.lombokjpademo.controller;

import com.example.lombokjpademo.entity.Employee;
import com.example.lombokjpademo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public Employee saveEmployee(@Validated @RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/fetchAll")
    public List<Employee> fetchEmployees() {
        return employeeService.fetchEmployees();
    }
}
