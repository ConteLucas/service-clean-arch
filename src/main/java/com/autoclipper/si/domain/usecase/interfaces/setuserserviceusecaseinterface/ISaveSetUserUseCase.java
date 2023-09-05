package com.autoclipper.si.domain.usecase.interfaces.setuserserviceusecaseinterface;

import com.autoclipper.si.domain.entities.setuserentities.ESetUserRequest;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;

public interface ISaveSetUserUseCase {
    ESetUserResponse save(ESetUserRequest eSetUserRequest);
}
