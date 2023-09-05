package com.autoclipper.si.domain.usecase.impl.setleadsserviceusecaseimpl;

import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;
import com.autoclipper.si.domain.gateway.ISetLeadsGateway;
import com.autoclipper.si.domain.usecase.interfaces.setleadsserviceusecaseinterface.ISaveSetLeadsUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class SaveSetLeadsUseCase implements ISaveSetLeadsUseCase {

    @Inject
    private ISetLeadsGateway iSetLeadsGateway;

    @Override
    @Transactional
    public ESetLeadsResponse save(ESetLeadsRequest eSetLeadsRequest) {
        return iSetLeadsGateway.save(eSetLeadsRequest);
    }
}
