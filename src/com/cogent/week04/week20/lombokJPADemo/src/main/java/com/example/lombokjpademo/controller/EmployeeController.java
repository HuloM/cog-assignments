package com.example.lombokjpademo.controller;

import com.example.lombokjpademo.entity.Employee;
import com.example.lombokjpademo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@Validated @RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/fetchEmployees")
    public List<Employee> fetchEmployees() {
        return employeeService.fetchEmployees();
    }
}
