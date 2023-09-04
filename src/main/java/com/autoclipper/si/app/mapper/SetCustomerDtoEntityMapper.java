package com.autoclipper.si.app.mapper;

import com.autoclipper.si.app.dto.SetCustomerRequestDto;
import com.autoclipper.si.app.dto.SetCustomerResponseDto;
import com.autoclipper.si.app.dto.client.ClipperHackerRequestDTO;
import com.autoclipper.si.app.dto.client.TsuruRequestDTO;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerRequest;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
public class SetCustomerDtoEntityMapper {

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
