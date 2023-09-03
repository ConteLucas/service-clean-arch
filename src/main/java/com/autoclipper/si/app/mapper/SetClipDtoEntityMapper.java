package com.autoclipper.si.app.mapper;

import com.autoclipper.si.app.dto.SetClipRequestDto;
import com.autoclipper.si.app.dto.SetClipResponseDto;
import com.autoclipper.si.domain.entities.setclipentities.ESetClipRequest;
import com.autoclipper.si.domain.entities.setclipentities.ESetClipResponse;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
public class SetClipDtoEntityMapper {
    public ESetClipRequest dtoToEntity(SetClipRequestDto dto) {
        if (dto == null) {
            return null;
        }
        return ESetClipRequest.builder()
                .clipId(dto.getClipId())
                .processId(dto.getProcessId())
                .customerId(dto.getCustomerId())
                .videoId(dto.getVideoId())
                .videoUrlCreateClip(dto.getVideoUrlCreateClip())
                .title(dto.getTitle())
                .thumb(dto.getThumb())
                .score(dto.getScore())
                .transcriptClip(dto.getTranscriptClip())
                .build();
    }

    public ESetClipResponse dtoToEntity(SetClipResponseDto dto) {
        if (dto == null) {
            return null;
        }
        return ESetClipResponse.builder()
                .clipId(dto.getClipId())
                .processId(dto.getProcessId())
                .customerId(dto.getCustomerId())
                .videoId(dto.getVideoId())
                .videoUrlCreateClip(dto.getVideoUrlCreateClip())
                .title(dto.getTitle())
                .thumb(dto.getThumb())
                .score(dto.getScore())
                .transcriptClip(dto.getTranscriptClip())
                .build();
    }

    public SetClipResponseDto entityToDto(ESetClipResponse entity) {
        if (entity == null) {
            return null;
        }
        return SetClipResponseDto.builder()
                .clipId(entity.getClipId())
                .processId(entity.getProcessId())
                .customerId(entity.getCustomerId())
                .videoId(entity.getVideoId())
                .videoUrlCreateClip(entity.getVideoUrlCreateClip())
                .title(entity.getTitle())
                .thumb(entity.getThumb())
                .score(entity.getScore())
                .transcriptClip(entity.getTranscriptClip())
                .build();
    }

    public List<SetClipResponseDto> entityListToDtoList(List<ESetClipResponse> entityList) {
        return entityList.stream()
                .filter(Objects::nonNull)
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
}
