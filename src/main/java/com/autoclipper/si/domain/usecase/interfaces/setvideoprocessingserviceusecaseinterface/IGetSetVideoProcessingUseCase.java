package com.autoclipper.si.domain.usecase.interfaces.setvideoprocessingserviceusecaseinterface;

import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;

import java.util.List;

public interface IGetSetVideoProcessingUseCase {
    List<ESetVideoProcessingResponse> getAll();
    ESetVideoProcessingResponse getSetVideoProcessingById(Integer id);
}
