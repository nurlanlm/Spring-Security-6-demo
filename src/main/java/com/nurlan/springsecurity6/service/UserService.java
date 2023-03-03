package com.nurlan.springsecurity6.service;

import com.nurlan.springsecurity6.entity.User;

import java.util.List;

public interface UserService {
    User addUser(User user);

    List<User> getAllUsers();

}
