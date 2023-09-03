package com.autoclipper.si.domain.usecase.impl;

import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;
import com.autoclipper.si.domain.gateway.ISetVideoGateway;
import com.autoclipper.si.domain.usecase.interfaces.IGetSetVideoUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class GetSetVideoUseCase implements IGetSetVideoUseCase {

    @Inject
    private ISetVideoGateway iSetVideoGateway;

    @Override
    public List<ESetVideoResponse> getAll() {
        return iSetVideoGateway.getAll();
    }

    @Override
    public ESetVideoResponse getSetVideoById(Integer id) {
        return iSetVideoGateway.getSetVideoById(id);
    }
}
