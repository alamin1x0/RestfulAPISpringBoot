package com.example.getapi.api.controller;

import com.example.getapi.api.model.User;
import com.example.getapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController; // Import the RestController annotation

import java.util.Optional;

@RestController // Add the RestController annotation
public class UserController {

    private final UserService userService; // Make the userService final

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam Integer id) {
        Optional<User> user = userService.getUser(id);
        return user.orElse(null); // Simplify the return statement using orElse
    }
}
