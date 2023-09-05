package com.autoclipper.si.app.service.impl.setcustomerserviceimpl;

import com.autoclipper.si.app.service.interfaces.setcustomerserviceinterface.IUpdateSetCustomerService;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerRequest;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;
import com.autoclipper.si.domain.usecase.interfaces.setcustomerserviceusecaseinterface.IUpdateSetCustomerUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UpdateSetCustomerServiceImpl implements IUpdateSetCustomerService {

    @Inject
    private IUpdateSetCustomerUseCase updateSetCustomerUseCase;

    @Override
    public ESetCustomerResponse updateSetCustomer(Integer id, ESetCustomerRequest eSetCustomerRequest) {
        return updateSetCustomerUseCase.updateSetCustomer(id, eSetCustomerRequest);
    }
}
