package com.autoclipper.si.domain.usecase.interfaces.setvideoserviceusecaseinterface;

import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoRequest;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;

public interface IUpdateSetVideoUseCase {
    ESetVideoResponse updateSetVideo(Integer id, ESetVideoRequest eSetVideoRequest);
}
