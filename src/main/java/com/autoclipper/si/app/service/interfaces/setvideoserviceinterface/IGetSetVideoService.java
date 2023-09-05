package com.autoclipper.si.app.service.interfaces.setvideoserviceinterface;

import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;

import java.util.List;

public interface IGetSetVideoService {
    List<ESetVideoResponse> getAllSetVideos();
    ESetVideoResponse getSetVideoById(Integer id);
}
