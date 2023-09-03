package com.autoclipper.si.domain.entities.setuserentities;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RegisterForReflection
public class ESetUserResponse {
    private Integer userId;
    private String userEmail;
    private String userPhone;
    private String userPassword;
    private String userType;
    private Timestamp userCreationDate;
}
