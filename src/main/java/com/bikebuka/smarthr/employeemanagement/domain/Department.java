package com.bikebuka.smarthr.employeemanagement.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Department {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
}
