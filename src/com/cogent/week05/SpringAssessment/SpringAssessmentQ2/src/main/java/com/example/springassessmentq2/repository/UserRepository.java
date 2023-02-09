package com.example.springassessmentq2.repository;

import com.example.springassessmentq2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.userName = ?1")
    User findByUsername(String username);
}
