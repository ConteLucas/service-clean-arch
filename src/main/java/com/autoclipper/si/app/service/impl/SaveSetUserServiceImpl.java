package com.autoclipper.si.app.service.impl;

import com.autoclipper.si.app.service.interfaces.ISaveSetUserService;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserRequest;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;
import com.autoclipper.si.domain.usecase.interfaces.ISaveSetUserUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class SaveSetUserServiceImpl implements ISaveSetUserService {

    @Inject
    private ISaveSetUserUseCase saveSetUserUseCase;

    @Override
    public ESetUserResponse saveSetUser(ESetUserRequest eSetUserRequest) {
        return saveSetUserUseCase.save(eSetUserRequest);
    }
}
