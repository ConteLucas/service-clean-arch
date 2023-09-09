package com.autoclipper.si.app.mapper.setcustomeruser;

import com.autoclipper.si.app.dto.setuserclientdto.SetUserResponseDto;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
@ApplicationScoped
public class SetUserEntityToDToMapper {

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
