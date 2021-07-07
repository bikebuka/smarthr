package com.bikebuka.smarthr.employeemanagement.repository;

import com.bikebuka.smarthr.employeemanagement.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
