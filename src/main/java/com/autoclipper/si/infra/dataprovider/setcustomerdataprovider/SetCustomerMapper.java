package com.autoclipper.si.infra.dataprovider.setcustomerdataprovider;


import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerRequest;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;
import com.autoclipper.si.infra.db.model.SetCustomer;
import groovy.util.logging.Log4j2;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
@Log4j2
public class SetCustomerMapper {

    public SetCustomer eSetCustomerToSetCustomer(ESetCustomerRequest eSetCustomerRequest) {
        if (Objects.nonNull(eSetCustomerRequest)) {
            return SetCustomer.builder()
                    .customerId(eSetCustomerRequest.getCustomerId())
                    .userId(eSetCustomerRequest.getUserId())
                    .leadId(eSetCustomerRequest.getLeadId())
                    .customerName(eSetCustomerRequest.getCustomerName())
                    .customerPhone(eSetCustomerRequest.getCustomerPhone())
                    .customerAddress(eSetCustomerRequest.getCustomerAddress())
                    .customerCpfCnpj(eSetCustomerRequest.getCustomerCpfCnpj())
                    .customerCep(eSetCustomerRequest.getCustomerCep())
                    .build();
        }
        throw new NullPointerException("NullPointerException set_customer/SetCustomerMapper");
    }

    public ESetCustomerResponse eSetCustomerToESetCustomerResponse(SetCustomer setCustomer) {
        if (Objects.nonNull(setCustomer)) {
            return ESetCustomerResponse.builder()
                    .customerId(setCustomer.getCustomerId())
                    .userId(setCustomer.getUserId().getUserId())
                    .leadId(setCustomer.getLeadId().getLeadId())
                    .customerName(setCustomer.getCustomerName())
                    .customerPhone(setCustomer.getCustomerPhone())
                    .customerAddress(setCustomer.getCustomerAddress())
                    .customerCpfCnpj(setCustomer.getCustomerCpfCnpj())
                    .customerCep(setCustomer.getCustomerCep())
                    .build();
        }
        throw new NullPointerException("NullPointerException set_customer/SetCustomerMapper");
    }

    public List<ESetCustomerResponse> setListToESetListResponseList(List<SetCustomer> all) {
        return all.stream().map(this::eSetCustomerToESetCustomerResponse).collect(Collectors.toList());
    }

    public SetCustomer updateSetCustomerFromRequest(SetCustomer existingSetCustomer, ESetCustomerRequest eSetCustomerRequest){
        existingSetCustomer.setCustomerName(eSetCustomerRequest.getCustomerName());
        existingSetCustomer.setCustomerPhone(eSetCustomerRequest.getCustomerPhone());
        existingSetCustomer.setCustomerAddress(eSetCustomerRequest.getCustomerAddress());
        existingSetCustomer.setCustomerCpfCnpj(eSetCustomerRequest.getCustomerCpfCnpj());
        existingSetCustomer.setCustomerCep(eSetCustomerRequest.getCustomerCep());
        return existingSetCustomer;
    }


}
