package com.autoclipper.si.app.service.impl;

import com.autoclipper.si.app.service.interfaces.IGetSetClipService;
import com.autoclipper.si.domain.entities.setclipentities.ESetClipResponse;
import com.autoclipper.si.domain.usecase.interfaces.IGetSetClipUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class GetSetClipServiceImpl implements IGetSetClipService {

    @Inject
    private IGetSetClipUseCase getSetClipUseCase;

    @Override
    public List<ESetClipResponse> getAllSetClips() {
        return getSetClipUseCase.getAll();
    }

    @Override
    public ESetClipResponse getSetClipById(Integer id) {
        return getSetClipUseCase.getSetClipById(id);
    }
}
