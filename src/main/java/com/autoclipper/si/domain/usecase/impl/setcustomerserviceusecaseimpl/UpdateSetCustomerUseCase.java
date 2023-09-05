package com.autoclipper.si.domain.usecase.impl.setcustomerserviceusecaseimpl;

import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerRequest;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;
import com.autoclipper.si.domain.gateway.ISetCustomerGateway;
import com.autoclipper.si.domain.usecase.interfaces.setcustomerserviceusecaseinterface.IUpdateSetCustomerUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class UpdateSetCustomerUseCase implements IUpdateSetCustomerUseCase {

    @Inject
    private ISetCustomerGateway iSetCustomerGateway;

    @Override
    @Transactional
    public ESetCustomerResponse updateSetCustomer(Integer id, ESetCustomerRequest eSetCustomerRequest) {
        return iSetCustomerGateway.updateSetCustomer(id, eSetCustomerRequest);
    }
}
