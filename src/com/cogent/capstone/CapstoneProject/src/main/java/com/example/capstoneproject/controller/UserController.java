package com.example.capstoneproject.controller;

import com.example.capstoneproject.entity.AuthRequest;
import com.example.capstoneproject.entity.User;
import com.example.capstoneproject.service.interfaces.UserService;
import com.example.capstoneproject.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private JWTUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/")
    public String Home() {
        return "Welcome to the User Page";
    }

    @PostMapping("/adduser")
    public User AddUser(@RequestBody User user) {
        return userService.AddUser(user);
    }

    @PutMapping("/updateuser")
    public User UpdateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @PostMapping("/getByLogin")
    public String Login(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("inavalid username/password");
        }
        return jwtUtil.generateToken(authRequest.getUserName());
    }
}
