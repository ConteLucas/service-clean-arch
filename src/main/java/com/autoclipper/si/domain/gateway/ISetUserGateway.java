package com.autoclipper.si.domain.gateway;

import com.autoclipper.si.domain.entities.setuserentities.ESetUserRequest;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;

import java.util.List;

public interface ISetUserGateway {
    ESetUserResponse save(ESetUserRequest eSetUserRequest);

    List<ESetUserResponse> getAll();

    void delete(Integer id);

    ESetUserResponse updateSetUser(Integer id, ESetUserRequest eSetUserRequest);

    ESetUserResponse getSetUserById(Integer id);
}
