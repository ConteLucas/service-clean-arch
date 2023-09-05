package com.autoclipper.si.domain.usecase.impl.setclipserviceusecaseimpl;

import com.autoclipper.si.domain.entities.setclipentities.ESetClipRequest;
import com.autoclipper.si.domain.entities.setclipentities.ESetClipResponse;
import com.autoclipper.si.domain.gateway.ISetClipGateway;
import com.autoclipper.si.domain.usecase.interfaces.setclipserviceusecaseinterface.ISaveSetClipUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class SaveSetClipUseCase implements ISaveSetClipUseCase {

    @Inject
    private ISetClipGateway iSetClipGateway;

    @Override
    @Transactional
    public ESetClipResponse save(ESetClipRequest eSetClipRequest) {
        return iSetClipGateway.save(eSetClipRequest);
    }
}
