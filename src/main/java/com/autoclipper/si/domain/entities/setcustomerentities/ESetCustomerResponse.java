package com.autoclipper.si.domain.entities.setcustomerentities;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RegisterForReflection
public class ESetCustomerResponse {
    private Integer customerId;
    private Integer userId;
    private Integer leadId;
    private String customerCpfCnpj;
    private String customerName;
    private String customerPhone;
    private String customerAddress;
    private String customerCep;
}
