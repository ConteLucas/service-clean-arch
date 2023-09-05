package com.autoclipper.si.domain.usecase.impl.setcustomerserviceusecaseimpl;

import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerRequest;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;
import com.autoclipper.si.domain.gateway.ISetCustomerGateway;
import com.autoclipper.si.domain.usecase.interfaces.setcustomerserviceusecaseinterface.ISaveSetCustomerUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class SaveSetCustomerUseCase implements ISaveSetCustomerUseCase {

    @Inject
    private ISetCustomerGateway iSetCustomerGateway;

    @Override
    @Transactional
    public ESetCustomerResponse save(ESetCustomerRequest eSetCustomerRequest) {
        return iSetCustomerGateway.save(eSetCustomerRequest);
    }
}
