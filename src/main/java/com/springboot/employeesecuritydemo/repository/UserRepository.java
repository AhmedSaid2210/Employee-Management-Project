package com.springboot.employeesecuritydemo.repository;

import com.springboot.employeesecuritydemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
