package com.autoclipper.si.domain.gateway;

import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoRequest;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;

import java.util.List;

public interface ISetVideoGateway {
    ESetVideoResponse save(ESetVideoRequest eSetVideoRequest);

    List<ESetVideoResponse> getAll();

    void delete(Integer id);

    ESetVideoResponse updateSetVideo(Integer id, ESetVideoRequest eSetVideoRequest);

    ESetVideoResponse getSetVideoById(Integer id);
}
