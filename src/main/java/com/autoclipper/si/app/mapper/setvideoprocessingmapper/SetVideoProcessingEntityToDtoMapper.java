package com.autoclipper.si.app.mapper.setvideoprocessingmapper;

import com.autoclipper.si.app.dto.setvideoprocessingclientdto.SetVideoProcessingResponseDto;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;
import groovy.util.logging.Log4j2;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
@ApplicationScoped
public class SetVideoProcessingEntityToDtoMapper {
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
