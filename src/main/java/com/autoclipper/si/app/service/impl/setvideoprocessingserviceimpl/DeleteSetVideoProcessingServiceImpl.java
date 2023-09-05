package com.autoclipper.si.app.service.impl.setvideoprocessingserviceimpl;

import com.autoclipper.si.app.service.interfaces.setvideoprocessingserviceinterface.IDeleteSetVideoProcessingService;
import com.autoclipper.si.domain.usecase.interfaces.setvideoprocessingserviceusecaseinterface.IDeleteSetVideoProcessingUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class DeleteSetVideoProcessingServiceImpl implements IDeleteSetVideoProcessingService {

    @Inject
    private IDeleteSetVideoProcessingUseCase deleteSetVideoProcessingUseCase;

    @Override
    public void deleteSetVideoProcessing(Integer id) {
        deleteSetVideoProcessingUseCase.delete(id);
    }
}
