package com.nurlan.springsecurity6.controller;

import com.nurlan.springsecurity6.entity.User;
import com.nurlan.springsecurity6.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
