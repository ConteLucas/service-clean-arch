package com.autoclipper.si.app.mapper.setleadsmappers;

import com.autoclipper.si.app.dto.setleadsclientdto.SetLeadsResponseDto;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
public class SetLeadsEntityToDtoMapper {
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
