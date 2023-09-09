package com.autoclipper.si.app.mapper.setclipmappers;

import com.autoclipper.si.app.dto.setclipclientdto.SetClipRequestDto;
import com.autoclipper.si.app.dto.setclipclientdto.SetClipResponseDto;
import com.autoclipper.si.domain.entities.setclipentities.ESetClipRequest;
import com.autoclipper.si.domain.entities.setclipentities.ESetClipResponse;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
public class SetClipDtoToEntityMapper {
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
}
