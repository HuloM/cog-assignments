package com.example.springassessmentq2.service;

import com.example.springassessmentq2.entity.User;
import com.example.springassessmentq2.repository.UserRepository;
import com.example.springassessmentq2.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public User AddUser(User user) {
        return repository.save(user);
    }

    @Override
    public User getUserById(int id) {
        return repository.findById(id).orElse(null);
    }

}
