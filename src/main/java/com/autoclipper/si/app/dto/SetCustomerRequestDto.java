package com.autoclipper.si.app.dto;

import com.autoclipper.si.infra.db.model.SetLeads;
import com.autoclipper.si.infra.db.model.SetUser;
import io.smallrye.common.constraint.NotNull;
import lombok.*;

@Data
@Generated
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SetCustomerRequestDto {
    @NotNull
    private Integer customerId;
    @NotNull
    private String customerName;
    @NotNull
    private String customerPhone;

    private SetUser userId;
    private SetLeads leadId;
    private String customerCpfCnpj;
    private String customerAddress;
    private String customerCep;
}
