package com.autoclipper.si.app.service.impl.setvideoserviceimpl;

import com.autoclipper.si.app.service.interfaces.setvideoserviceinterface.ISaveSetVideoService;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoRequest;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SaveSetVideoServiceImpl implements ISaveSetVideoService {


    @Override
    public ESetVideoResponse saveSetVideo(ESetVideoRequest eSetVideoRequest) {
        return null;
    }
}
