package org.example.config;

import org.example.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public Employee employee() {
        return new Employee(1, "John", 1000.0);
    }
}
