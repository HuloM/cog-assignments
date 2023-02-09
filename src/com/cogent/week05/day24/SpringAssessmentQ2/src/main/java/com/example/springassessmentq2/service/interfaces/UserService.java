package com.example.springassessmentq2.service.interfaces;

import com.example.springassessmentq2.entity.User;

import java.util.List;

public interface UserService {
    User AddUser(User user);
    User getUserById(int id);
}