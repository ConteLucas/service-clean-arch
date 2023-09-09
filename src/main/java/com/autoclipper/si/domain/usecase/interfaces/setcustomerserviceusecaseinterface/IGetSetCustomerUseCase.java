package com.autoclipper.si.domain.usecase.interfaces.setcustomerserviceusecaseinterface;

import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;

import java.util.List;

public interface IGetSetCustomerUseCase {
    List<ESetCustomerResponse> getAll();
    ESetCustomerResponse getSetCustomerById(Integer id);

}
