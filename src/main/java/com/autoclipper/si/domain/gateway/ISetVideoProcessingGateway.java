package com.autoclipper.si.domain.gateway;

import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingRequest;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;

import java.util.List;

public interface ISetVideoProcessingGateway {
    ESetVideoProcessingResponse save(ESetVideoProcessingRequest eSetVideoProcessingRequest);

    List<ESetVideoProcessingResponse> getAll();

    void delete(Integer id);

    ESetVideoProcessingResponse updateSetVideoProcessing(Integer id, ESetVideoProcessingRequest eSetVideoProcessingRequest);

    ESetVideoProcessingResponse getSetVideoProcessingById(Integer id);
}
