package com.autoclipper.si.domain.usecase.impl;

import com.autoclipper.si.domain.entities.setclipentities.ESetClipRequest;
import com.autoclipper.si.domain.entities.setclipentities.ESetClipResponse;
import com.autoclipper.si.domain.gateway.ISetClipGateway;
import com.autoclipper.si.domain.usecase.interfaces.IUpdateSetClipUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class UpdateSetClipUseCase implements IUpdateSetClipUseCase {

    @Inject
    private ISetClipGateway iSetClipGateway;

    @Override
    @Transactional
    public ESetClipResponse updateSetClip(Integer id, ESetClipRequest eSetClipRequest) {
        return iSetClipGateway.updateSetClip(id, eSetClipRequest);
    }
}
