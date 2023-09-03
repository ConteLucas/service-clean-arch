package com.autoclipper.si.domain.usecase.impl;

import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;
import com.autoclipper.si.domain.gateway.ISetVideoProcessingGateway;
import com.autoclipper.si.domain.usecase.interfaces.IGetSetVideoProcessingUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class GetSetVideoProcessingUseCase implements IGetSetVideoProcessingUseCase {

    @Inject
    private ISetVideoProcessingGateway iSetVideoProcessingGateway;

    @Override
    public List<ESetVideoProcessingResponse> getAll() {
        return iSetVideoProcessingGateway.getAll();
    }

    @Override
    public ESetVideoProcessingResponse getSetVideoProcessingById(Integer id) {
        return iSetVideoProcessingGateway.getSetVideoProcessingById(id);
    }
}
