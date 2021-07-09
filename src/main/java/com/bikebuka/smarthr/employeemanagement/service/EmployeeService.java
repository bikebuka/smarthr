package com.bikebuka.smarthr.employeemanagement.service;

import com.bikebuka.smarthr.employeemanagement.domain.Employee;
import com.bikebuka.smarthr.employeemanagement.model.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();

    Employee getEmployeeById(Long id);

    void updateEmployee(Employee employee);

    Employee createEmployee(EmployeeDto employee);

    Employee getEmployeeByUserId(String id);

    void deleteEmployee(Long id);
}
