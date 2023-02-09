package com.example.springassessmentq2.controller;

import com.example.springassessmentq2.entity.AuthRequest;
import com.example.springassessmentq2.entity.User;
import com.example.springassessmentq2.service.interfaces.UserService;
import com.example.springassessmentq2.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private JWTUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/register")
    public User AddUser(@RequestBody User user) {
        return userService.AddUser(user);
    }

    @PostMapping("/login")
    public String Login(@RequestBody AuthRequest authRequest) throws Exception {
        // login method to provide a jwt token to the user for authorization
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            return "inavalid username/password";
        }
        return jwtUtil.generateToken(authRequest.getUserName());
    }
}
