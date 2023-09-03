package com.autoclipper.si.app.dto;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.smallrye.common.constraint.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.security.Timestamp;

@Data
@Generated
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SetUserRequestDto {
    @NotNull
    private Integer userId;
    @NotNull
    private String userEmail;
    private String userPhone;
    private String userType;
    private Timestamp userCreationDate;
}
