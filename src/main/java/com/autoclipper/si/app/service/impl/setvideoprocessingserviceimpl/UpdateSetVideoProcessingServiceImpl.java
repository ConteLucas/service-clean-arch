package com.autoclipper.si.app.service.impl.setvideoprocessingserviceimpl;

import com.autoclipper.si.app.service.interfaces.setvideoprocessingserviceinterface.IUpdateSetVideoProcessingService;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingRequest;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;
import com.autoclipper.si.domain.usecase.interfaces.setuserserviceusecaseinterface.IUpdateSetVideoProcessingUseCase;
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
