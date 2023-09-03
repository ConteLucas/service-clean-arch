package com.autoclipper.si.app.mapper;

import com.autoclipper.si.app.dto.SetVideoRequestDto;
import com.autoclipper.si.app.dto.SetVideoResponseDto;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoRequest;
import jakarta.enterprise.context.ApplicationScoped;
import groovy.util.logging.Log4j2;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
@Log4j2
public class SetVideoDtoEntityMapper {
    public ESetVideoRequest dtoToEntity(SetVideoRequestDto dto) {
        if (dto == null) {
            return null;
        }
        return ESetVideoRequest.builder()
                .videoId(dto.getVideoId())
                .processId(dto.getProcessId())
                .customerId(dto.getCustomerId())
                .videoCreationDate(dto.getVideoCreationDate())
                .transcriptionSrt(dto.getTranscriptionSrt())
                .transcriptionTxt(dto.getTranscriptionTxt())
                .build();
    }

    public ESetVideoResponse dtoToEntity(SetVideoResponseDto dto) {
        if (dto == null) {
            return null;
        }
        return ESetVideoResponse.builder()
                .videoId(dto.getVideoId())
                .processId(dto.getProcessId())
                .customerId(dto.getCustomerId())
                .videoCreationDate(dto.getVideoCreationDate())
                .transcriptionSrt(dto.getTranscriptionSrt())
                .transcriptionTxt(dto.getTranscriptionTxt())
                .build();
    }

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
