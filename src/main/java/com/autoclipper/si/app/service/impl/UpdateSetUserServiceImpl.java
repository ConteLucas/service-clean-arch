package com.autoclipper.si.app.service.impl;

import com.autoclipper.si.app.service.interfaces.IUpdateSetUserService;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserRequest;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;
import com.autoclipper.si.domain.usecase.interfaces.IUpdateSetUserUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UpdateSetUserServiceImpl implements IUpdateSetUserService {

    @Inject
    private IUpdateSetUserUseCase updateSetUserUseCase;

    @Override
    public ESetUserResponse updateSetUser(Integer id, ESetUserRequest eSetUserRequest) {
        return updateSetUserUseCase.updateSetUser(id, eSetUserRequest);
    }
}
