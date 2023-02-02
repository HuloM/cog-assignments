package com.example.crudapplication;

import com.example.crudapplication.employee.dao.EmployeeDAO;
import com.example.crudapplication.employee.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CrudApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        EmployeeDAO employeeDAO = (EmployeeDAO) context
                .getBean("employeeDAO");

        Employee employee = new Employee(2,
                "Gyanendra34", 42, 2000000);

//        employeeDAO.create(employee);
        System.out.println("Employee record inserted successfully.");

        System.out.println("-------Employee Records--------");
        employeeDAO.read();

//        employeeDAO.update(employee);
        System.out.println("Employee record updated successfully.");

        employeeDAO.read();


        employeeDAO.delete(employee.getEmployeeId());
        System.out.println("Employee record deleted successfully.");

        employeeDAO.read();
    }

}
