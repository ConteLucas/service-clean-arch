package com.autoclipper.si.domain.usecase.impl;

import com.autoclipper.si.domain.entities.setuserentities.ESetUserRequest;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;
import com.autoclipper.si.domain.gateway.ISetUserGateway;
import com.autoclipper.si.domain.usecase.interfaces.ISaveSetUserUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class SaveSetUserUseCase implements ISaveSetUserUseCase {

    @Inject
    private ISetUserGateway iSetUserGateway;

    @Override
    @Transactional
    public ESetUserResponse save(ESetUserRequest eSetUserRequest) {
        return iSetUserGateway.save(eSetUserRequest);
    }
}
