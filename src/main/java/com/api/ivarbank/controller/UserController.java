package com.api.ivarbank.controller;

import com.api.ivarbank.entity.User;
import com.api.ivarbank.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public boolean loginTemp(@RequestBody User user) {
        return userService.loginTemp(user.getUsername(), user.getPassword());
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable String username) {
        return userService.getUser(username);
    }
}
