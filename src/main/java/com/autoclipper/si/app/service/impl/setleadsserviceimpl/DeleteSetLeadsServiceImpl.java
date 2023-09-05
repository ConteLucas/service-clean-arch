package com.autoclipper.si.app.service.impl.setleadsserviceimpl;

import com.autoclipper.si.app.service.interfaces.setleadsserviceinterface.IDeleteSetLeadsService;
import com.autoclipper.si.domain.usecase.interfaces.setleadsserviceusecaseinterface.IDeleteSetLeadsUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class DeleteSetLeadsServiceImpl implements IDeleteSetLeadsService {

    @Inject
    private IDeleteSetLeadsUseCase deleteSetLeadsUseCase;

    @Override
    public void delete(Integer id) {
        deleteSetLeadsUseCase.delete(id);
    }
}
