package com.autoclipper.si.domain.usecase.interfaces.setvideoserviceusecaseinterface;

import com.autoclipper.si.app.dto.client.TsuruRequestDTO;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoRequest;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;

public interface ISaveSetVideoUseCase {
    ESetVideoResponse save(ESetVideoRequest eSetVideoRequest);
}
