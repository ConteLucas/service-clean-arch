package com.autoclipper.si.app.service.impl;

import com.autoclipper.si.app.service.interfaces.ISaveSetLeadsService;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;
import com.autoclipper.si.domain.usecase.interfaces.ISaveSetLeadsUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class SaveSetLeadsServiceImpl implements ISaveSetLeadsService {

    @Inject
    private ISaveSetLeadsUseCase saveSetLeadsUseCase;

    @Override
    public ESetLeadsResponse saveSetLeads(ESetLeadsRequest eSetLeadsRequest) {
        return saveSetLeadsUseCase.save(eSetLeadsRequest);
    }
}
