package com.autoclipper.si.domain.usecase.impl;

import com.autoclipper.si.domain.gateway.ISetVideoProcessingGateway;
import com.autoclipper.si.domain.usecase.interfaces.IDeleteSetProcessingVideoUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class DeleteSetVideoProcessingUseCase implements IDeleteSetProcessingVideoUseCase {

    @Inject
    private ISetVideoProcessingGateway iSetVideoProcessingGateway;

    @Override
    @Transactional
    public void delete(Integer id) {
        iSetVideoProcessingGateway.delete(id);
    }
}
