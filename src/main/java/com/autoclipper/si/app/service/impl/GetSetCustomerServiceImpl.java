package com.autoclipper.si.app.service.impl;

import com.autoclipper.si.app.service.interfaces.IGetSetCustomerService;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;
import com.autoclipper.si.domain.usecase.interfaces.IGetSetCustomerUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class GetSetCustomerServiceImpl implements IGetSetCustomerService {

    @Inject
    private IGetSetCustomerUseCase getSetCustomerUseCase;

    @Override
    public List<ESetCustomerResponse> getAllSetCustomers() {
        return getSetCustomerUseCase.getAll();
    }

    @Override
    public ESetCustomerResponse getSetCustomerById(Integer id) {
        return getSetCustomerUseCase.getSetCustomerById(id);
    }
}
