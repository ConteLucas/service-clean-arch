package com.autoclipper.si.domain.usecase.impl;

import com.autoclipper.si.domain.entities.setclipentities.ESetClipResponse;
import com.autoclipper.si.domain.gateway.ISetClipGateway;
import com.autoclipper.si.domain.usecase.interfaces.IGetSetClipUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class GetSetClipUseCase implements IGetSetClipUseCase {

    @Inject
    private ISetClipGateway iSetClipGateway;

    @Override
    public List<ESetClipResponse> getAll() {
        return iSetClipGateway.getAll();
    }

    @Override
    public ESetClipResponse getSetClipById(Integer id) {
        return iSetClipGateway.getSetClipById(id);
    }
}
