package com.autoclipper.si.domain.usecase.impl.setvideoprocessingserviceusecaseimpl;

import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingRequest;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;
import com.autoclipper.si.domain.gateway.ISetVideoProcessingGateway;
import com.autoclipper.si.domain.usecase.interfaces.setvideoprocessingserviceusecaseinterface.ISaveSetVideoProcessingUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class SaveSetVideoProcessingUseCase implements ISaveSetVideoProcessingUseCase {

    @Inject
    private ISetVideoProcessingGateway iSetVideoProcessingGateway;

    @Override
    @Transactional
    public ESetVideoProcessingResponse save(ESetVideoProcessingRequest eSetVideoProcessingRequest) {
        return iSetVideoProcessingGateway.save(eSetVideoProcessingRequest);
    }
}
