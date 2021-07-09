package com.bikebuka.smarthr.web.controllers.employeemanagement;

import com.bikebuka.smarthr.employeemanagement.domain.Department;
import com.bikebuka.smarthr.employeemanagement.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = "*", maxAge = 3260)
@RestController
@RequestMapping("/api/departments")
@AllArgsConstructor
public class DepartmentController {
    private final DepartmentService service;

    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartments() {
        return new ResponseEntity<>(service.getAllDepartments(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
        return new ResponseEntity<>(service.createDepartment(department), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getDepartmentById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateDepartment(@PathVariable Long id, @RequestBody Department department) {
        service.updateDepartment(department);
        return new ResponseEntity<>("Department updated", HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDepartment(@PathVariable Long id) {
        service.deleteDepartment(id);
        return new ResponseEntity<>("Department deleted", HttpStatus.NO_CONTENT);
    }
}
