package com.bikebuka.smarthr.employeemanagement.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class LeaveDetail {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
}
