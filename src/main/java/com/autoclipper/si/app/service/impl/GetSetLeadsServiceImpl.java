package com.autoclipper.si.app.service.impl;

import com.autoclipper.si.app.service.interfaces.IGetSetLeadsService;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;
import com.autoclipper.si.domain.usecase.interfaces.IGetSetLeadsUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class GetSetLeadsServiceImpl implements IGetSetLeadsService {

    @Inject
    private IGetSetLeadsUseCase getSetLeadsUseCase;

    @Override
    public List<ESetLeadsResponse> getAllSetLeads() {
        return getSetLeadsUseCase.getAll();
    }

    @Override
    public ESetLeadsResponse getSetLeadsById(Integer id) {
        return getSetLeadsUseCase.getSetLeadsById(id);
    }
}
