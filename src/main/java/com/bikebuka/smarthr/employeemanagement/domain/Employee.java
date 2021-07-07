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

    private String firstName;
    private String surname;
    private String phoneNumber;
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
    private OffsetDateTime birthDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<Leave> leave;

}
