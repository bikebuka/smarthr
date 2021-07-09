package com.bikebuka.smarthr.employeemanagement.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class AcademicHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String college;
    private String highSchool;
    private Double gpa;
    private String primarySchoolGrade;
    private String resumeUrl;
    private String coverLetterUrl;

}
