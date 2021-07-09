package com.bikebuka.smarthr.employeemanagement.domain;

import lombok.*;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class LeaveDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
}
