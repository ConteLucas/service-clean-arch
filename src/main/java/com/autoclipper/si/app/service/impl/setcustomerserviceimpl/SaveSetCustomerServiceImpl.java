package com.autoclipper.si.app.service.impl.setcustomerserviceimpl;

import com.autoclipper.si.app.service.interfaces.setcustomerserviceinterface.ISaveSetCustomerService;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerRequest;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;
import com.autoclipper.si.domain.usecase.interfaces.setcustomerserviceusecaseinterface.ISaveSetCustomerUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class SaveSetCustomerServiceImpl implements ISaveSetCustomerService {

    @Inject
    private ISaveSetCustomerUseCase saveSetCustomerUseCase;

    @Override
    public ESetCustomerResponse saveSetCustomer(ESetCustomerRequest eSetCustomerRequest) {
        return saveSetCustomerUseCase.save(eSetCustomerRequest);
    }
}
