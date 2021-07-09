package com.bikebuka.smarthr.employeemanagement.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Beneficiary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String contact;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
