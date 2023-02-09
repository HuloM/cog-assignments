package com.example.springsecurityjwtdemo.repository;

import com.example.springsecurityjwtdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
