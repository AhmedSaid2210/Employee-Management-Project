package com.springboot.employeesecuritydemo.repository;

import com.springboot.employeesecuritydemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
