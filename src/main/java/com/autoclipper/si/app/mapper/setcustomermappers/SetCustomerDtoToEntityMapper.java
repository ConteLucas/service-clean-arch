package com.autoclipper.si.app.mapper.setcustomermappers;

import com.autoclipper.si.app.dto.client.MessageRequestDTO;
import com.autoclipper.si.app.dto.client.old.TsuruRequestDTO;
import com.autoclipper.si.app.dto.setcustomerclientdto.SetCustomerRequestDto;
import com.autoclipper.si.app.dto.setcustomerclientdto.SetCustomerResponseDto;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerRequest;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SetCustomerDtoToEntityMapper {
    //Change the DTO from Phone
    public ESetCustomerRequest dtoToEntity(MessageRequestDTO dto) {
        return ESetCustomerRequest.builder()
                .customerPhone(dto.getPhoneNumber())
                .customerName(dto.getCustomerId())
                .build();
    }

    public ESetCustomerRequest dtoToEntity(SetCustomerRequestDto dto) {
        if (dto == null) {
            return null;
        }
        return ESetCustomerRequest.builder()
                .customerId(dto.getCustomerId())
                .userId(dto.getUserId())
                .leadId(dto.getLeadId())
                .customerCpfCnpj(dto.getCustomerCpfCnpj())
                .customerName(dto.getCustomerName())
                .customerPhone(dto.getCustomerPhone())
                .customerAddress(dto.getCustomerAddress())
                .customerCep(dto.getCustomerCep())
                .build();
    }

    public ESetCustomerResponse dtoToEntity(SetCustomerResponseDto dto) {
        if (dto == null) {
            return null;
        }
        return ESetCustomerResponse.builder()
                .customerId(dto.getCustomerId())
                .userId(dto.getUserId())
                .leadId(dto.getLeadId())
                .customerCpfCnpj(dto.getCustomerCpfCnpj())
                .customerName(dto.getCustomerName())
                .customerPhone(dto.getCustomerPhone())
                .customerAddress(dto.getCustomerAddress())
                .customerCep(dto.getCustomerCep())
                .build();
    }

}
