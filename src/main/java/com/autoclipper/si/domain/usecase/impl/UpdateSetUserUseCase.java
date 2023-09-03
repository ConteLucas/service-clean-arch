package com.autoclipper.si.domain.usecase.impl;

import com.autoclipper.si.domain.entities.setuserentities.ESetUserRequest;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;
import com.autoclipper.si.domain.gateway.ISetUserGateway;
import com.autoclipper.si.domain.usecase.interfaces.IUpdateSetUserUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class UpdateSetUserUseCase implements IUpdateSetUserUseCase {

    @Inject
    private ISetUserGateway iSetUserGateway;

    @Override
    @Transactional
    public ESetUserResponse updateSetUser(Integer id, ESetUserRequest eSetUserRequest) {
        return iSetUserGateway.updateSetUser(id, eSetUserRequest);
    }
}
