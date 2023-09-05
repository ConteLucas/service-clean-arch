package com.autoclipper.si.app.dto.setleadsclientdto;

import io.smallrye.common.constraint.NotNull;
import lombok.*;

@Data
@Generated
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SetLeadsRequestDto {
    @NotNull
    private Integer leadId;
    @NotNull
    private String leadName;
    @NotNull
    private String leadEmail;
    @NotNull
    private String leadPhone;
    @NotNull
    private String leadStatus;
    @NotNull
    private String leadSource;
}
