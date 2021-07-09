package com.bikebuka.smarthr.employeemanagement.domain;

import lombok.*;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private Long userId;

    private String firstName;
    private String surname;
    @OneToOne
    private Contact contact;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<Insurance> insurance;
    @OneToOne
    private AcademicHistory academicHistory;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<MedicalHistory> history;
    private String nextOfKin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<Beneficiary> beneficiaries;
    @OneToOne(cascade = CascadeType.REMOVE)
    private Department department;
    private Double hourlyRate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<Leave> leave;
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
