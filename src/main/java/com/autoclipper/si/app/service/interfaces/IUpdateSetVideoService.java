package com.autoclipper.si.app.service.interfaces;

import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoRequest;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;

public interface IUpdateSetVideoService {
    ESetVideoResponse updateSetVideo(Integer id, ESetVideoRequest eSetVideoRequest);
}
