package com.example.lombokjpademo.service;

import com.example.lombokjpademo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> fetchEmployees();
}
