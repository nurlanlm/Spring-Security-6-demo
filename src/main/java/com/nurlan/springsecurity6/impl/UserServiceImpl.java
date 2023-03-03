package com.nurlan.springsecurity6.impl;

import com.nurlan.springsecurity6.entity.User;
import com.nurlan.springsecurity6.repository.UserRepository;
import com.nurlan.springsecurity6.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
