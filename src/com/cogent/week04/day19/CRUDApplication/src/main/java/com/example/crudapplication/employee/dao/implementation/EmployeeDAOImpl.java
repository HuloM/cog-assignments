package com.example.crudapplication.employee.dao.implementation;

import com.example.crudapplication.employee.dao.EmployeeDAO;
import com.example.crudapplication.employee.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO
{

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource)
    {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(Employee employee) {
        String sql = "INSERT INTO EMPLOYEE "
                + "(EMPLOYEE_ID, EMP_NAME, AGE,SALARY) " +
                "VALUES (?, ?, ?,?)";

        jdbcTemplate.update(sql,
                new Object[] {
                        employee.getEmployeeId(),
                        employee.getName(),
                        employee.getAge(),
                        employee.getSalary()
                });
    }

    @Override
    public void read() {
        String sql = "SELECT * FROM EMPLOYEE";

        List<Employee> employees = jdbcTemplate.query(sql, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee employee = new Employee(
                        rs.getInt("EMPLOYEE_ID"),
                        rs.getString("EMP_NAME"),
                        rs.getInt("AGE"),
                        rs.getInt("SALARY"));
                return employee;
            }
        });
        System.out.println("-----------Employee Records---------");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public void update(Employee employee) {
        String sql = "UPDATE EMPLOYEE SET EMP_NAME = ?, " +
                "AGE = ?, SALARY = ? WHERE EMPLOYEE_ID = ?";

        jdbcTemplate.update(sql, new Object[] {
                employee.getName(),
                employee.getAge(),
                employee.getSalary(),
                employee.getEmployeeId()
        });
    }

    @Override
    public void delete(int employeeId) {
        String sql = "DELETE FROM EMPLOYEE WHERE EMPLOYEE_ID = ?";

        jdbcTemplate.update(sql, new Object[] {
                employeeId
        });
    }
}
