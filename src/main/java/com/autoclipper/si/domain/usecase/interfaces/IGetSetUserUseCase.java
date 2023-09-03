package com.autoclipper.si.domain.usecase.interfaces;

import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;

import java.util.List;

public interface IGetSetUserUseCase {
    List<ESetUserResponse> getAll();
    ESetUserResponse getSetUserById(Integer id);
}
