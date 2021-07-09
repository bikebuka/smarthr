package com.bikebuka.smarthr.employeemanagement.repository;

import com.bikebuka.smarthr.employeemanagement.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByName(String name);
}
