package com.bikebuka.smarthr.employeemanagement.repository;

import com.bikebuka.smarthr.employeemanagement.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
