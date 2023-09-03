package com.autoclipper.si.app.service.impl;

import com.autoclipper.si.app.service.interfaces.IGetSetVideoProcessingService;
import com.autoclipper.si.app.service.interfaces.IGetSetVideoService;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;
import com.autoclipper.si.domain.usecase.interfaces.IGetSetVideoProcessingUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class GetSetVideoProcessingServiceImpl implements IGetSetVideoProcessingService {

    @Inject
    private IGetSetVideoProcessingUseCase getSetVideoProcessingUseCase;

    @Override
    public List<ESetVideoProcessingResponse> getAllSetVideoProcessing() {
        return getSetVideoProcessingUseCase.getAll();
    }

    @Override
    public ESetVideoProcessingResponse getSetVideoProcessingById(Integer id) {
        return getSetVideoProcessingUseCase.getSetVideoProcessingById(id);
    }
}
