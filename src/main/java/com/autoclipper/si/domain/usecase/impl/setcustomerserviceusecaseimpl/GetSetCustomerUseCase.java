package com.autoclipper.si.domain.usecase.impl.setcustomerserviceusecaseimpl;

import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;
import com.autoclipper.si.domain.gateway.ISetCustomerGateway;
import com.autoclipper.si.domain.usecase.interfaces.setcustomerserviceusecaseinterface.IGetSetCustomerUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class GetSetCustomerUseCase implements IGetSetCustomerUseCase {

    @Inject
    private ISetCustomerGateway iSetCustomerGateway;

    @Override
    public List<ESetCustomerResponse> getAll() {
        return iSetCustomerGateway.getAll();
    }

    @Override
    public ESetCustomerResponse getSetCustomerById(Integer id) {
        return iSetCustomerGateway.getSetCustomerById(id);
    }

}
