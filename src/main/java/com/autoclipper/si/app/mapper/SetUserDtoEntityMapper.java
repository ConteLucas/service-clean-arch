package com.autoclipper.si.app.mapper;

import com.autoclipper.si.app.dto.SetUserRequestDto;
import com.autoclipper.si.app.dto.SetUserResponseDto;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserRequest;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
public class SetUserDtoEntityMapper {

    public ESetUserRequest dtoToEntity(SetUserRequestDto dto) {
        if (dto == null) {
            return null;
        }
        return ESetUserRequest.builder()
                .userId(dto.getUserId())
                .userPhone(dto.getUserPhone())
                .userType(dto.getUserType())
                .userEmail(dto.getUserEmail())
                .userCreationDate(dto.getUserCreationDate())
                .build();
    }

    public ESetUserResponse dtoToEntity(SetUserResponseDto dto) {
        if (dto == null) {
            return null;
        }
        return ESetUserResponse.builder()
                .userId(dto.getUserId())
                .userPhone(dto.getUserPhone())
                .userType(dto.getUserType())
                .userEmail(dto.getUserEmail())
                .userCreationDate(dto.getUserCreationDate())
                .build();
    }

    public SetUserResponseDto entityToDto(ESetUserResponse entity) {
        if (entity == null) {
            return null;
        }
        return SetUserResponseDto.builder()
                .userId(entity.getUserId())
                .userPhone(entity.getUserPhone())
                .userType(entity.getUserType())
                .userEmail(entity.getUserEmail())
                .userCreationDate(entity.getUserCreationDate())
                .build();
    }

    public List<SetUserResponseDto> entityListToDtoList(List<ESetUserResponse> entityList) {
        return entityList.stream()
                .filter(Objects::nonNull)
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
}