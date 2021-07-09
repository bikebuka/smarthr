package com.bikebuka.smarthr.employeemanagement.service;

import com.bikebuka.smarthr.employeemanagement.domain.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();

    Department getDepartmentById(Long id);

    Department createDepartment(Department department);

    void updateDepartment(Department department);

    void deleteDepartment(Long id);
}
