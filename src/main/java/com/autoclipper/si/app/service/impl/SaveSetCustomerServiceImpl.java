package com.autoclipper.si.app.service.impl;

import com.autoclipper.si.app.service.interfaces.ISaveSetCustomerService;
import com.autoclipper.si.app.service.interfaces.ISaveSetLeadsService;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerRequest;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;
import com.autoclipper.si.domain.usecase.interfaces.ISaveSetCustomerUseCase;
import com.autoclipper.si.domain.usecase.interfaces.ISaveSetLeadsUseCase;
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
