package com.example.springsecurityjwtdemo.service;

import com.example.springsecurityjwtdemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);
    Employee findById(Long id);
    void deleteById(Long id);
    Employee update(Employee employee);
    List<Employee> findAll();
}
