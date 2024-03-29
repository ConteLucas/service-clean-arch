package com.autoclipper.si.domain.usecase.impl.setleadsserviceusecaseimpl;

import com.autoclipper.si.domain.gateway.ISetLeadsGateway;
import com.autoclipper.si.domain.usecase.interfaces.setleadsserviceusecaseinterface.IDeleteSetLeadsUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class DeleteSetLeadsUseCase implements IDeleteSetLeadsUseCase {

    @Inject
    private ISetLeadsGateway iSetLeadsGateway;

    @Override
    @Transactional
    public void delete(Integer id) {
        iSetLeadsGateway.delete(id);
    }
}
