package com.autoclipper.si.domain.usecase.impl;

import com.autoclipper.si.domain.gateway.ISetCustomerGateway;
import com.autoclipper.si.domain.usecase.interfaces.IDeleteSetCustomerUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class DeleteSetCustomerUseCase implements IDeleteSetCustomerUseCase {

    @Inject
    private ISetCustomerGateway iSetCustomerGateway;

    @Override
    @Transactional
    public void delete(Integer id) {
        iSetCustomerGateway.delete(id);
    }
}
