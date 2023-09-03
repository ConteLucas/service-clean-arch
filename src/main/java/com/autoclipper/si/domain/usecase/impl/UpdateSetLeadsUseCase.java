package com.autoclipper.si.domain.usecase.impl;

import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;
import com.autoclipper.si.domain.gateway.ISetLeadsGateway;
import com.autoclipper.si.domain.usecase.interfaces.IUpdateSetLeadsUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class UpdateSetLeadsUseCase implements IUpdateSetLeadsUseCase {

    @Inject
    private ISetLeadsGateway iSetLeadsGateway;

    @Override
    @Transactional
    public ESetLeadsResponse updateSetLeads(Integer id, ESetLeadsRequest eSetLeadsRequest) {
        return iSetLeadsGateway.updateSetLeads(id, eSetLeadsRequest);
    }

}
