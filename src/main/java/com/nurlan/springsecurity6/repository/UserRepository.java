package com.nurlan.springsecurity6.repository;

import com.nurlan.springsecurity6.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
