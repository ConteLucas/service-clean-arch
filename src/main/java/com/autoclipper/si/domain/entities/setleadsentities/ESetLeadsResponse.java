package com.autoclipper.si.domain.entities.setleadsentities;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RegisterForReflection
public class ESetLeadsResponse {
    private Integer leadId;
    private String leadName;
    private String leadEmail;
    private String leadPhone;
    private String leadStatus;
    private String leadSource;


}
