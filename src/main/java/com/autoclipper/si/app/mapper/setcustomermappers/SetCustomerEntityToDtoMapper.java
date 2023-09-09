package com.autoclipper.si.app.mapper.setcustomermappers;

import com.autoclipper.si.app.dto.setcustomerclientdto.SetCustomerResponseDto;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
@ApplicationScoped
public class SetCustomerEntityToDtoMapper {
    public SetCustomerResponseDto entityToDto(ESetCustomerResponse entity) {
        if (entity == null) {
            return null;
        }
        return SetCustomerResponseDto.builder()
                .customerId(entity.getCustomerId())
                .userId(entity.getUserId())
                .leadId(entity.getLeadId())
                .customerCpfCnpj(entity.getCustomerCpfCnpj())
                .customerName(entity.getCustomerName())
                .customerPhone(entity.getCustomerPhone())
                .customerAddress(entity.getCustomerAddress())
                .customerCep(entity.getCustomerCep())
                .build();
    }

    public List<SetCustomerResponseDto> entityListToDtoList(List<ESetCustomerResponse> entityList) {
        return entityList.stream()
                .filter(Objects::nonNull)
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
}
