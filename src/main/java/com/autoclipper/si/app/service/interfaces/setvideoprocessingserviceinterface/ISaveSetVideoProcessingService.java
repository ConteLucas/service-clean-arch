package com.autoclipper.si.app.service.interfaces.setvideoprocessingserviceinterface;

import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoRequest;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingRequest;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;

public interface ISaveSetVideoProcessingService {
    ESetVideoProcessingResponse saveSetVideoProcessing(ESetVideoProcessingRequest eSetVideoProcessingRequest);
}
