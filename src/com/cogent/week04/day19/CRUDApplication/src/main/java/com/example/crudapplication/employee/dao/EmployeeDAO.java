package com.example.crudapplication.employee.dao;

import com.example.crudapplication.employee.model.Employee;

public interface EmployeeDAO {
    public void create(Employee employee);
    public void read();
    public void update(Employee employee);
    public void delete(int employeeId);
}
