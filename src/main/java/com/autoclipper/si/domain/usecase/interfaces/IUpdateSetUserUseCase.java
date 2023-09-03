package com.autoclipper.si.domain.usecase.interfaces;

import com.autoclipper.si.domain.entities.setuserentities.ESetUserRequest;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;

public interface IUpdateSetUserUseCase {
    ESetUserResponse updateSetUser(Integer id, ESetUserRequest eSetUserRequest);
}
