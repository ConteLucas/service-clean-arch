package com.autoclipper.si.app.dto.setuserclientdto;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

import java.security.Timestamp;

@Data
@Generated
@Builder
@AllArgsConstructor
@NoArgsConstructor
@RegisterForReflection
public class SetUserResponseDto {
    private Integer userId;
    private String userEmail;
    private String userPhone;
    private String userPassword;
    private String userType;
    private Timestamp userCreationDate;
}
