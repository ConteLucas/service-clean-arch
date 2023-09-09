package com.autoclipper.si.domain.entities.setcustomerentities;

import com.autoclipper.si.infra.db.model.SetLeads;
import com.autoclipper.si.infra.db.model.SetUser;
import com.autoclipper.si.infra.db.model.SetVideo;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RegisterForReflection
public class ESetCustomerRequest {
    private Integer customerId;
    private SetUser userId;
    private SetLeads leadId;
    private String customerCpfCnpj;
    private String customerName;
    private String customerPhone;
    private String customerAddress;
    private String customerCep;
    private SetVideo groupVideoId;
}
