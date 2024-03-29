package com.autoclipper.si.app.mapper.setvideomappers;

import com.autoclipper.si.app.dto.setvideoclientdto.SetVideoResponseDto;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
public class SetVideoEntityToDtoMapper {
    public SetVideoResponseDto entityToDto(ESetVideoResponse entity) {
        if (entity == null) {
            return null;
        }
        return SetVideoResponseDto.builder()
                .videoId(entity.getVideoId())
                .processId(entity.getProcessId())
                .customerId(entity.getCustomerId())
                .videoCreationDate(entity.getVideoCreationDate())
                .transcriptionSrt(entity.getTranscriptionSrt())
                .transcriptionTxt(entity.getTranscriptionTxt())
                .build();
    }

    public List<SetVideoResponseDto> entityListToDtoList(List<ESetVideoResponse> entityList) {
        return entityList.stream()
                .filter(Objects::nonNull)
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
}
