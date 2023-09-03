package com.autoclipper.si.app.service.interfaces;

import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;

import java.util.List;

public interface IGetSetVideoProcessingService {
    List<ESetVideoProcessingResponse> getAllSetVideoProcessing();
    ESetVideoProcessingResponse getSetVideoProcessingById(Integer id);
}
