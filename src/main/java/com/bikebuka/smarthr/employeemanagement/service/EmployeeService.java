package com.bikebuka.smarthr.employeemanagement.service;

import com.bikebuka.smarthr.employeemanagement.domain.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();

    Employee getEmployeeById(Long id);

    void updateEmployee(Employee employee);

    Employee createEmployee(Employee employee);

    void deleteEmployee(Long id);
}
