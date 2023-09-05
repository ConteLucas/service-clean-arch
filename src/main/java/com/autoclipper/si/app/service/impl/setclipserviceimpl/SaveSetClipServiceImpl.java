package com.autoclipper.si.app.service.impl.setclipserviceimpl;

import com.autoclipper.si.app.service.interfaces.setclipserviceinterface.ISaveSetClipService;
import com.autoclipper.si.domain.entities.setclipentities.ESetClipRequest;
import com.autoclipper.si.domain.entities.setclipentities.ESetClipResponse;
import com.autoclipper.si.domain.usecase.interfaces.setclipserviceusecaseinterface.ISaveSetClipUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class SaveSetClipServiceImpl implements ISaveSetClipService {

    @Inject
    private ISaveSetClipUseCase saveSetClipUseCase;

    @Override
    public ESetClipResponse saveSetClip(ESetClipRequest eSetClipRequest) {
        return saveSetClipUseCase.save(eSetClipRequest);
    }
}
