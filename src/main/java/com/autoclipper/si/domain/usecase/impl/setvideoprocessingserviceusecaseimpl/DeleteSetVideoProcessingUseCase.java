package com.autoclipper.si.domain.usecase.impl.setvideoprocessingserviceusecaseimpl;

import com.autoclipper.si.domain.gateway.ISetVideoProcessingGateway;
import com.autoclipper.si.domain.usecase.interfaces.setvideoprocessingserviceusecaseinterface.IDeleteSetVideoProcessingUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class DeleteSetVideoProcessingUseCase implements IDeleteSetVideoProcessingUseCase {

    @Inject
    private ISetVideoProcessingGateway iSetVideoProcessingGateway;

    @Override
    @Transactional
    public void delete(Integer id) {
        iSetVideoProcessingGateway.delete(id);
    }
}
