package com.bikebuka.smarthr.employeemanagement.service;

import com.bikebuka.smarthr.employeemanagement.domain.Department;
import com.bikebuka.smarthr.employeemanagement.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long id) {
        return departmentRepository
                .findById(id)
                .orElseThrow(IllegalStateException::new);
    }

    @Override
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public void updateDepartment(Department department) {
        Department databaseDepartment = departmentRepository
                .findById(department.getId())
                .orElseThrow(IllegalStateException::new);

        databaseDepartment.setName(department.getName());
        departmentRepository.save(databaseDepartment);
    }

    @Override
    public void deleteDepartment(Long id) {
        Department department = departmentRepository.findById(id)
                .orElseThrow(IllegalStateException::new);
        departmentRepository.delete(department);
    }
}
