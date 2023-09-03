package com.autoclipper.si.app.service.impl;

import com.autoclipper.si.app.service.interfaces.ISaveSetVideoProcessingService;
import com.autoclipper.si.app.service.interfaces.ISaveSetVideoService;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoRequest;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingRequest;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;
import com.autoclipper.si.domain.usecase.interfaces.ISaveSetVideoProcessingUseCase;
import com.autoclipper.si.domain.usecase.interfaces.ISaveSetVideoUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class SaveSetVideoProcessingServiceImpl implements ISaveSetVideoProcessingService {

    @Inject
    private ISaveSetVideoProcessingUseCase saveSetVideoProcessingUseCase;

    @Override
    public ESetVideoProcessingResponse saveSetVideoProcessing(ESetVideoProcessingRequest eSetVideoProcessingRequest) {
        return saveSetVideoProcessingUseCase.save(eSetVideoProcessingRequest);
    }
}
