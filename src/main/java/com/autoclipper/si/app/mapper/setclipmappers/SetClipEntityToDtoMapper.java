package com.autoclipper.si.app.mapper.setclipmappers;

import com.autoclipper.si.app.dto.setclipclientdto.SetClipResponseDto;
import com.autoclipper.si.domain.entities.setclipentities.ESetClipResponse;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
public class SetClipEntityToDtoMapper {

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
