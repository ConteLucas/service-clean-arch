package com.autoclipper.si.app.mapper.setleadsmappers;

import com.autoclipper.si.app.dto.setleadsclientdto.SetLeadsRequestDto;
import com.autoclipper.si.app.dto.setleadsclientdto.SetLeadsResponseDto;
import com.autoclipper.si.app.dto.client.old.ClipperHackerRequestDTO;
import com.autoclipper.si.app.dto.client.old.TsuruRequestDTO;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import jakarta.enterprise.context.ApplicationScoped;
import groovy.util.logging.Log4j2;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
@Log4j2
public class SetLeadsDtoToEntityMapper {

    public ESetLeadsRequest dtoToEntity(TsuruRequestDTO tsuruRequest) {
        if (tsuruRequest == null) {
            return null;
        }
        String customerName = "api-access-clip";

        return ESetLeadsRequest.builder()
                .leadPhone(tsuruRequest.getPhoneNumber())
                .leadName(customerName)
                .leadSource(tsuruRequest.getVideoUrl())
                .build();
    }
    public ESetLeadsRequest dtoToEntity(ClipperHackerRequestDTO clipperHackerRequest) {
        if (clipperHackerRequest == null) {
            return null;
        }
        String customerName = "api-access-clip";

        return ESetLeadsRequest.builder()
                .leadPhone(clipperHackerRequest.getPhone())
                .leadName(customerName)
                .leadSource(clipperHackerRequest.getMessage())
                .build();
    }
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

}
