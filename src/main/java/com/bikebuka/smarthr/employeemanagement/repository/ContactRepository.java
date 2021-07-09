package com.bikebuka.smarthr.employeemanagement.repository;

import com.bikebuka.smarthr.employeemanagement.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
