package com.autoclipper.si.domain.usecase.impl;

import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoRequest;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;
import com.autoclipper.si.domain.gateway.ISetVideoGateway;
import com.autoclipper.si.domain.usecase.interfaces.ISaveSetVideoUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class SaveSetVideoUseCase implements ISaveSetVideoUseCase {

    @Inject
    private ISetVideoGateway iSetVideoGateway;

    @Override
    @Transactional
    public ESetVideoResponse save(ESetVideoRequest eSetVideoRequest) {
        return iSetVideoGateway.save(eSetVideoRequest);
    }
}
