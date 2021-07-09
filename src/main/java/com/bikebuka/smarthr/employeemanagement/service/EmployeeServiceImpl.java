package com.bikebuka.smarthr.employeemanagement.service;

import com.bikebuka.smarthr.employeemanagement.domain.AcademicHistory;
import com.bikebuka.smarthr.employeemanagement.domain.Contact;
import com.bikebuka.smarthr.employeemanagement.domain.Department;
import com.bikebuka.smarthr.employeemanagement.domain.Employee;
import com.bikebuka.smarthr.employeemanagement.model.EmployeeDto;
import com.bikebuka.smarthr.employeemanagement.repository.AcademicHistoryRepository;
import com.bikebuka.smarthr.employeemanagement.repository.ContactRepository;
import com.bikebuka.smarthr.employeemanagement.repository.DepartmentRepository;
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
    private final DepartmentRepository departmentRepository;
    private final AcademicHistoryRepository academicHistoryRepository;
    private final ContactRepository contactRepository;

    @Override
    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Employee with id " + id + " does not exist"));
    }

    @Override
    public void updateEmployee(Employee employee) {
        Employee databaseEmployee = repository.findById(employee.getId())
                .orElseThrow(() -> new IllegalStateException("Employee: " + employee + " does not exist"));
        if (databaseEmployee != null) {
            repository.save(employee);
            log.debug("Employee " + employee + " Saved");
        }

    }

    @Override
    public Employee createEmployee(EmployeeDto employee) {
        Department department = departmentRepository.findById(employee.getDepartmentId())
                .orElseThrow(() -> new IllegalStateException("Department not found"));
        AcademicHistory history = academicHistoryRepository.save(new AcademicHistory(0L,
                employee.getCollege(),
                employee.getHighSchool(),
                employee.getGpa(),
                employee.getPrimarySchoolGrade(),
                employee.getResumeUrl(),
                employee.getCoverLetterUrl()));

        Contact contact = contactRepository.save(new Contact(0L,
                employee.getPhoneNumber(),
                employee.getPostalAddress(),
                employee.getEmailAddress()));

        Employee employee1 = Employee.builder()
                .academicHistory(history)
                .beneficiaries(null)
                .dateOfBirth(employee.getBirthDate())
                .employmentDate(employee.getEmploymentDate())
                .contact(contact)
                .employmentPosition(employee.getEmploymentPosition())
                .employmentType(employee.getEmploymentType())
                .status(employee.getStatus())
                .passportNumber(employee.getPassportNumber())
                .nssfNumber(employee.getNssfNumber())
                .nhifNumber(employee.getNhifNumber())
                .nationality(employee.getNationality())
                .idNumber(employee.getIdNumber())
                .gender(employee.getGender())
                .homeCountry(employee.getHomeCountry())
                .staffNumber(employee.getStaffNumber())
                .imagePath(employee.getImagePath())
                .leave(null)
                .history(null)
                .userId(employee.getUserId())
                .hourlyRate(employee.getHourlyRate())
                .insurance(null)
                .department(department)
                .firstName(employee.getFirstName())
                .surname(employee.getSurname())
                .nextOfKin(null)
                .build();
        if (repository.findByIdNumber(employee1.getIdNumber()).isPresent()) {
            throw new IllegalStateException("Employee with Nation Id " + employee1.getIdNumber() + " already exist");
        }
        return repository.save(employee1);
    }

    @Override
    public Employee getEmployeeByUserId(String id) {
        return repository.findByUserId(Long.valueOf(id)).orElseThrow(() -> new IllegalStateException("Employee with user Id " + id + " does not exist"));

    }

    @Override
    public void deleteEmployee(Long id) {
        Employee databaseEmployee = repository.findById(id)
                .orElseThrow(IllegalStateException::new);
        repository.deleteById(databaseEmployee.getId());
    }
}
