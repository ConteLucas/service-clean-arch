package com.autoclipper.si.app.mapper;

import com.autoclipper.si.app.dto.SetLeadsRequestDto;
import com.autoclipper.si.app.dto.SetLeadsResponseDto;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import jakarta.enterprise.context.ApplicationScoped;
import groovy.util.logging.Log4j2;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
@Log4j2
public class SetLeadsDtoEntityMapper {
    public ESetLeadsRequest dtoToEntity(SetLeadsRequestDto dto) {
        if (dto == null) {
            return null;
        }
        return ESetLeadsRequest.builder()
                .leadId(dto.getLeadId())
                .leadName(dto.getLeadName())
                .leadEmail(dto.getLeadEmail())
                .leadPhone(dto.getLeadPhone())
                .leadStatus(dto.getLeadStatus())
                .leadSource(dto.getLeadSource())
                .build();
    }

    public ESetLeadsResponse dtoToEntity(SetLeadsResponseDto dto) {
        if (dto == null) {
            return null;
        }
        return ESetLeadsResponse.builder()
                .leadId(dto.getLeadId())
                .leadName(dto.getLeadName())
                .leadEmail(dto.getLeadEmail())
                .leadPhone(dto.getLeadPhone())
                .leadStatus(dto.getLeadStatus())
                .leadSource(dto.getLeadSource())
                .build();
    }

    public SetLeadsResponseDto entityToDto(ESetLeadsResponse entity) {
        if (entity == null) {
            return null;
        }
        return SetLeadsResponseDto.builder()
                .leadId(entity.getLeadId())
                .leadName(entity.getLeadName())
                .leadEmail(entity.getLeadEmail())
                .leadPhone(entity.getLeadPhone())
                .leadStatus(entity.getLeadStatus())
                .leadSource(entity.getLeadSource())
                .build();
    }

    public List<SetLeadsResponseDto> entityListToDtoList(List<ESetLeadsResponse> entityList) {
        return entityList.stream()
                .filter(Objects::nonNull)
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
}
