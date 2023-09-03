package com.autoclipper.si.app.service.impl;

import com.autoclipper.si.app.service.interfaces.IUpdateSetVideoService;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoRequest;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;
import com.autoclipper.si.domain.usecase.interfaces.IUpdateSetVideoUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UpdateSetVideoServiceImpl implements IUpdateSetVideoService {

    @Inject
    private IUpdateSetVideoUseCase updateSetVideoUseCase;

    @Override
    public ESetVideoResponse updateSetVideo(Integer id, ESetVideoRequest eSetVideoRequest) {
        return updateSetVideoUseCase.updateSetVideo(id, eSetVideoRequest);
    }
}
