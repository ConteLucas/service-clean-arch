package com.autoclipper.si.app.service.impl;

import com.autoclipper.si.app.service.interfaces.ISaveSetVideoService;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoRequest;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;
import com.autoclipper.si.domain.usecase.interfaces.ISaveSetVideoUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class SaveSetVideoServiceImpl implements ISaveSetVideoService {


    @Override
    public ESetVideoResponse saveSetVideo(ESetVideoRequest eSetVideoRequest) {
        return null;
    }
}
