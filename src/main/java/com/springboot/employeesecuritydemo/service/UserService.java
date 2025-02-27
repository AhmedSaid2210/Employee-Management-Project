package com.springboot.employeesecuritydemo.service;

import com.springboot.employeesecuritydemo.UserRegistrationDto;
import com.springboot.employeesecuritydemo.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
