package com.autoclipper.si.app.mapper.setvideoprocessingmapper;

import com.autoclipper.si.app.dto.setvideoprocessingclientdto.SetVideoProcessingRequestDto;
import com.autoclipper.si.app.dto.setvideoprocessingclientdto.SetVideoProcessingResponseDto;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingRequest;
import jakarta.enterprise.context.ApplicationScoped;
import groovy.util.logging.Log4j2;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
@Log4j2
public class SetVideoProcessingDtoToEntityMapper {
    public ESetVideoProcessingRequest dtoToEntity(SetVideoProcessingRequestDto dto) {
        if (dto == null) {
            return null;
        }
        return ESetVideoProcessingRequest.builder()
                .processId(dto.getProcessId())
                .customerId(dto.getCustomerId())
                .url(dto.getUrl())
                .startVideo(dto.getStartVideo())
                .endVideo(dto.getEndVideo())
                .avgClipDuration(dto.getAvgClipDuration())
                .statusReq(dto.getStatusReq())
                .build();
    }

    public ESetVideoProcessingResponse dtoToEntity(SetVideoProcessingResponseDto dto) {
        if (dto == null) {
            return null;
        }
        return ESetVideoProcessingResponse.builder()
                .processId(dto.getProcessId())
                .customerId(dto.getCustomerId())
                .url(dto.getUrl())
                .startVideo(dto.getStartVideo())
                .endVideo(dto.getEndVideo())
                .avgClipDuration(dto.getAvgClipDuration())
                .statusReq(dto.getStatusReq())
                .build();
    }

    public SetVideoProcessingResponseDto entityToDto(ESetVideoProcessingResponse entity) {
        if (entity == null) {
            return null;
        }
        return SetVideoProcessingResponseDto.builder()
                .processId(entity.getProcessId())
                .customerId(entity.getCustomerId())
                .url(entity.getUrl())
                .startVideo(entity.getStartVideo())
                .endVideo(entity.getEndVideo())
                .avgClipDuration(entity.getAvgClipDuration())
                .statusReq(entity.getStatusReq())
                .build();
    }

    public List<SetVideoProcessingResponseDto> entityListToDtoList(List<ESetVideoProcessingResponse> entityList) {
        return entityList.stream()
                .filter(Objects::nonNull)
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
}
