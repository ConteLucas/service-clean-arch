package com.autoclipper.si.app.service.interfaces.setuserserviceinterface;

import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;

import java.util.List;

public interface IGetSetUserService {
    List<ESetUserResponse> getAllSetUsers();
    ESetUserResponse getSetUserById(Integer id);
}
