package com.autoclipper.si.app.service.impl.setvideoprocessingserviceimpl;

import com.autoclipper.si.app.service.interfaces.setvideoprocessingserviceinterface.ISaveSetVideoProcessingService;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingRequest;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;
import com.autoclipper.si.domain.usecase.interfaces.setvideoprocessingserviceusecaseinterface.ISaveSetVideoProcessingUseCase;
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
