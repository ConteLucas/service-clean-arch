package com.autoclipper.si.domain.usecase.impl.setleadsserviceusecaseimpl;

import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;
import com.autoclipper.si.domain.gateway.ISetLeadsGateway;
import com.autoclipper.si.domain.usecase.interfaces.setleadsserviceusecaseinterface.IGetSetLeadsUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class GetSetLeadsUseCase implements IGetSetLeadsUseCase {

    @Inject
    private ISetLeadsGateway iSetLeadsGateway;

    @Override
    public List<ESetLeadsResponse> getAll() {
        return iSetLeadsGateway.getAll();
    }

    @Override
    public ESetLeadsResponse getSetLeadsById(Integer id) {
        return iSetLeadsGateway.getSetLeadsById(id);
    }

}
