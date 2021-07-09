package com.bikebuka.smarthr.employeemanagement.service;

import com.bikebuka.smarthr.employeemanagement.domain.Employee;
import com.bikebuka.smarthr.employeemanagement.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository repository;

    @Override
    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return repository.findById(id)
                .orElseThrow(IllegalStateException::new);
    }

    @Override
    public void updateEmployee(Employee employee) {
        Employee databaseEmployee = repository.findById(employee.getId())
                .orElseThrow(IllegalStateException::new);
        if (databaseEmployee != null) {
            repository.save(employee);
            log.debug("Employee " + employee + " Saved");
        }

    }

    @Override
    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        Employee databaseEmployee = repository.findById(id)
                .orElseThrow(IllegalStateException::new);
        repository.deleteById(databaseEmployee.getId());
    }
}
