package com.autoclipper.si.domain.usecase.interfaces.setuserserviceusecaseinterface;

import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingRequest;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;

public interface IUpdateSetVideoProcessingUseCase {
    ESetVideoProcessingResponse updateSetVideoProcessing(Integer id, ESetVideoProcessingRequest eSetVideoProcessingRequest);
}
