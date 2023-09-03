package com.autoclipper.si.domain.usecase.interfaces;

import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoRequest;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingRequest;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;

public interface ISaveSetVideoProcessingUseCase {
    ESetVideoProcessingResponse save(ESetVideoProcessingRequest eSetVideoProcessingRequest);
}
