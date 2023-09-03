package com.autoclipper.si.infra.db.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
@EqualsAndHashCode(callSuper= false)
@Entity
@Table(name = "set_user")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SetUser extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id" , nullable = false)
    private Integer userId;
    @Column(name = "user_email", nullable = false)
    private String userEmail;
    @Column(name = "user_phone", nullable = false)
    private String userPhone;
    @Column(name = "user_password", nullable = false)
    private String userPassword;
    @Column(name = "user_type", nullable = false)
    private String userType;
    @Column(name = "user_creation_date", nullable = false)
    private Timestamp userCreationDate;
}