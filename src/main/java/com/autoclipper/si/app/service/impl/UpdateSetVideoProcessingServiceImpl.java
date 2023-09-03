package com.autoclipper.si.app.service.impl;

import com.autoclipper.si.app.service.interfaces.IUpdateSetVideoProcessingService;
import com.autoclipper.si.app.service.interfaces.IUpdateSetVideoService;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoRequest;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingRequest;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;
import com.autoclipper.si.domain.usecase.interfaces.IUpdateSetVideoProcessingUseCase;
import com.autoclipper.si.domain.usecase.interfaces.IUpdateSetVideoUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UpdateSetVideoProcessingServiceImpl implements IUpdateSetVideoProcessingService {

    @Inject
    private IUpdateSetVideoProcessingUseCase updateSetVideoProcessingUseCase;

    @Override
    public ESetVideoProcessingResponse updateSetVideoProcessing(Integer id, ESetVideoProcessingRequest eSetVideoProcessingRequest) {
        return updateSetVideoProcessingUseCase.updateSetVideoProcessing(id, eSetVideoProcessingRequest);
    }
}
