package com.example.springsecurityexercise;

import com.example.springsecurityexercise.entity.User;
import com.example.springsecurityexercise.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityExerciseApplication {

    @Autowired
    UserRepository repository;

    @PostConstruct
    public void initUsers() {
        List<User> users = Stream.of(
                new User(101L, "user1", "pwd1", "email@gmail.com"),
                new User(102L, "user2", "pwd2", "email2@gmail.com"),
                new User(103L, "user3", "pwd3", "email3@gmail.com")
        ).collect(Collectors.toList());
        repository.saveAll(users);
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityExerciseApplication.class, args);
    }

}
