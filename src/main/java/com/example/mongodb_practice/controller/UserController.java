package com.example.mongodb_practice.controller;

import com.example.mongodb_practice.entity.User;
import com.example.mongodb_practice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public String getUserIdByUserName(@RequestParam String id) {
        return userService.getUserIdByUserName(id);
    }

    @GetMapping("/user")
    public List<User> getAllUserList() {
        return userService.getAllUser();
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/user")
    public void deleteUserById(@RequestParam String id) {
        userService.deleteUserById(id);
    }

}
