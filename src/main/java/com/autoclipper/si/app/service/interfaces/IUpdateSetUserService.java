package com.autoclipper.si.app.service.interfaces;

import com.autoclipper.si.domain.entities.setuserentities.ESetUserRequest;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;

public interface IUpdateSetUserService {
    ESetUserResponse updateSetUser(Integer id, ESetUserRequest eSetUserRequest);
}
