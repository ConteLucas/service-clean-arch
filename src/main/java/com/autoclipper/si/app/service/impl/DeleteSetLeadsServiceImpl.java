package com.autoclipper.si.app.service.impl;

import com.autoclipper.si.app.service.interfaces.IDeleteSetLeadsService;
import com.autoclipper.si.domain.usecase.interfaces.IDeleteSetLeadsUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class DeleteSetLeadsServiceImpl implements IDeleteSetLeadsService {

    @Inject
    private IDeleteSetLeadsUseCase deleteSetLeadsUseCase;

    @Override
    public void deleteSetLeads(Integer id) {
        deleteSetLeadsUseCase.delete(id);
    }
}
