package com.bikebuka.smarthr.employeemanagement.model;

import com.bikebuka.smarthr.employeemanagement.domain.EmploymentPosition;
import com.bikebuka.smarthr.employeemanagement.domain.EmploymentStatus;
import com.bikebuka.smarthr.employeemanagement.domain.EmploymentType;
import com.bikebuka.smarthr.employeemanagement.domain.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private Long id;

    private String firstName;
    private String surname;

    private Long userId;
    //Contact
    private String phoneNumber;
    private String postalAddress;
    private String emailAddress;
    //Academic History
    private String college;
    private String highSchool;
    private Double gpa;
    private String primarySchoolGrade;
    private String resumeUrl;
    private String coverLetterUrl;
    private String departmentId;
    private Double hourlyRate;
    private OffsetDateTime birthDate;
    private String imagePath;
    private EmploymentType employmentType;
    private EmploymentPosition employmentPosition;
    private String staffNumber;
    private String homeCountry;
    private String nationality;
    private Gender gender;
    private String idNumber;
    private String nhifNumber;
    private String nssfNumber;
    private String passportNumber;
    private OffsetDateTime dateOfBirth;
    private OffsetDateTime employmentDate;
    private EmploymentStatus status;

}
