package com.autoclipper.si.app.dto.setleadsclientdto;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

@Data
@Generated
@Builder
@AllArgsConstructor
@NoArgsConstructor
@RegisterForReflection
public class SetLeadsResponseDto {

    private Integer leadId;
    private String leadName;
    private String leadEmail;
    private String leadPhone;
    private String leadStatus;
    private String leadSource;
}
