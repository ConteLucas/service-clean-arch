package com.autoclipper.si.app.service.impl;

import com.autoclipper.si.app.service.interfaces.IUpdateSetClipService;
import com.autoclipper.si.domain.entities.setclipentities.ESetClipRequest;
import com.autoclipper.si.domain.entities.setclipentities.ESetClipResponse;
import com.autoclipper.si.domain.usecase.interfaces.IUpdateSetClipUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UpdateSetClipServiceImpl implements IUpdateSetClipService {

    @Inject
    private IUpdateSetClipUseCase updateSetClipUseCase;

    @Override
    public ESetClipResponse updateSetClip(Integer id, ESetClipRequest eSetClipRequest) {
        return updateSetClipUseCase.updateSetClip(id, eSetClipRequest);
    }
}
