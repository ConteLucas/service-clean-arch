package com.autoclipper.si.app.service.impl;

import com.autoclipper.si.app.service.interfaces.IGetSetVideoService;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;
import com.autoclipper.si.domain.usecase.interfaces.IGetSetVideoUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class GetSetVideoServiceImpl implements IGetSetVideoService {

    @Inject
    private IGetSetVideoUseCase getSetVideoUseCase;

    @Override
    public List<ESetVideoResponse> getAllSetVideos() {
        return getSetVideoUseCase.getAll();
    }

    @Override
    public ESetVideoResponse getSetVideoById(Integer id) {
        return getSetVideoUseCase.getSetVideoById(id);
    }
}
