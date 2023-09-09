package com.autoclipper.si.app.mapper.setcustomeruser;

import com.autoclipper.si.app.dto.setuserclientdto.SetUserRequestDto;
import com.autoclipper.si.app.dto.setuserclientdto.SetUserResponseDto;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserRequest;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
public class SetUserDtoToEntityMapper {

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

}
