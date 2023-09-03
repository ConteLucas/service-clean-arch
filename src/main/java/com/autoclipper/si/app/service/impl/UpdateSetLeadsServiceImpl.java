package com.autoclipper.si.app.service.impl;

import com.autoclipper.si.app.service.interfaces.IUpdateSetLeadsService;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;
import com.autoclipper.si.domain.usecase.interfaces.IUpdateSetLeadsUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UpdateSetLeadsServiceImpl implements IUpdateSetLeadsService {

    @Inject
    private IUpdateSetLeadsUseCase updateSetLeadsUseCase;

    @Override
    public ESetLeadsResponse updateSetLeads(Integer id, ESetLeadsRequest eSetLeadsRequest) {
        return updateSetLeadsUseCase.updateSetLeads(id, eSetLeadsRequest);
    }
}
