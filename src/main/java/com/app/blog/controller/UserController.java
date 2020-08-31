package com.app.blog.controller;

import com.app.blog.model.User;
import com.app.blog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")

public class UserController {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    private  final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        LOG.info("Getting all users.");
        return userService.findAll();
    }

    @PostMapping
    public User addNewUser(@RequestBody User user) {
        LOG.info("Saving user.");
        return userService.create(user);
    }
}
