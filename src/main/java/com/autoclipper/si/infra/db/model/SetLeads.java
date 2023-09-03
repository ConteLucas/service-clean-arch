package com.autoclipper.si.infra.db.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "set_leads")
public class SetLeads extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lead_id" , nullable = false)
    private Integer leadId;
    @Column(name = "lead_name", nullable = false)
    private String leadName;
    @Column(name = "lead_email", nullable = false)
    private String leadEmail;
    @Column(name = "lead_phone", nullable = false)
    private String leadPhone;
    @Column(name = "lead_status", nullable = false)
    private String leadStatus;
    @Column(name = "lead_source", nullable = false)
    private String leadSource;
}
