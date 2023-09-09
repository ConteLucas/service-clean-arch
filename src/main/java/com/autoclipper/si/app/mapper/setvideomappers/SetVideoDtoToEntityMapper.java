package com.autoclipper.si.app.mapper.setvideomappers;

import com.autoclipper.si.app.dto.client.MessageRequestDTO;
import com.autoclipper.si.app.dto.setvideoclientdto.SetVideoRequestDto;
import com.autoclipper.si.app.dto.setvideoclientdto.SetVideoResponseDto;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoRequest;
import jakarta.enterprise.context.ApplicationScoped;
import groovy.util.logging.Log4j2;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
@Log4j2
public class SetVideoDtoToEntityMapper {

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

}
