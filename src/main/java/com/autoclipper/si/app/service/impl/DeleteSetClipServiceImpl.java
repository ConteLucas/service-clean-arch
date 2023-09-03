package com.autoclipper.si.app.service.impl;

import com.autoclipper.si.app.service.interfaces.IDeleteSetClipService;
import com.autoclipper.si.domain.usecase.interfaces.IDeleteSetClipUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class DeleteSetClipServiceImpl implements IDeleteSetClipService {

    @Inject
    private IDeleteSetClipUseCase deleteSetClipUseCase;

    @Override
    public void deleteSetClip(Integer id) {
        deleteSetClipUseCase.delete(id);
    }
}
