package com.autoclipper.si.app.service.impl.setleadsserviceimpl;

import com.autoclipper.si.app.service.interfaces.setleadsserviceinterface.ISaveSetLeadsService;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;
import com.autoclipper.si.domain.usecase.interfaces.setleadsserviceusecaseinterface.ISaveSetLeadsUseCase;
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
