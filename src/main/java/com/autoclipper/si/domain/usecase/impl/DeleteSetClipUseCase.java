package com.autoclipper.si.domain.usecase.impl;

import com.autoclipper.si.domain.gateway.ISetClipGateway;
import com.autoclipper.si.domain.usecase.interfaces.IDeleteSetClipUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class DeleteSetClipUseCase implements IDeleteSetClipUseCase {

    @Inject
    private ISetClipGateway iSetClipGateway;

    @Override
    @Transactional
    public void delete(Integer id) {
        iSetClipGateway.delete(id);
    }
}
