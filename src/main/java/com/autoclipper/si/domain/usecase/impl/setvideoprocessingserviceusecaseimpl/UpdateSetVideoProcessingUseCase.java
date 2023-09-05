package com.autoclipper.si.domain.usecase.impl.setvideoprocessingserviceusecaseimpl;

import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingRequest;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;
import com.autoclipper.si.domain.gateway.ISetVideoProcessingGateway;
import com.autoclipper.si.domain.usecase.interfaces.setuserserviceusecaseinterface.IUpdateSetVideoProcessingUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class UpdateSetVideoProcessingUseCase implements IUpdateSetVideoProcessingUseCase {

    @Inject
    private ISetVideoProcessingGateway iSetVideoProcessingGateway;

    @Override
    @Transactional
    public ESetVideoProcessingResponse updateSetVideoProcessing(Integer id, ESetVideoProcessingRequest eSetVideoProcessingRequest) {
        return iSetVideoProcessingGateway.updateSetVideoProcessing(id, eSetVideoProcessingRequest);
    }
}
