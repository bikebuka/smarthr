package com.bikebuka.smarthr.employeemanagement.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Leave {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String leaveName;
    private String leaveDescription;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
