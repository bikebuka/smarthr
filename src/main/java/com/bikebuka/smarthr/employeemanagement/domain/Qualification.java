package com.bikebuka.smarthr.employeemanagement.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Qualification {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String experience;
    private String skills;

}
