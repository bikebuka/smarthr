package com.bikebuka.smarthr.employeemanagement.repository;

import com.bikebuka.smarthr.employeemanagement.domain.Leave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<Leave, Long> {
}
