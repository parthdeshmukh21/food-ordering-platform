package com.foodordering.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/register")
    public String register() {
        return "User Registered";
    }

    @PostMapping("/login")
    public String login() {
        return "Login Successful";
    }

    @GetMapping("/profile/{id}")
    public String profile(@PathVariable String id) {
        return "Profile for user " + id;
    }
}
