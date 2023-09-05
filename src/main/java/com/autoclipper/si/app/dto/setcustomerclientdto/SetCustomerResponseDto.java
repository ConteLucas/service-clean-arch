package com.autoclipper.si.app.dto.setcustomerclientdto;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

@Data
@Generated
@Builder
@AllArgsConstructor
@NoArgsConstructor
@RegisterForReflection
public class SetCustomerResponseDto {
    private Integer customerId;
    private Integer userId;
    private Integer leadId;
    private String customerCpfCnpj;
    private String customerName;
    private String customerPhone;
    private String customerAddress;
    private String customerCep;
}
