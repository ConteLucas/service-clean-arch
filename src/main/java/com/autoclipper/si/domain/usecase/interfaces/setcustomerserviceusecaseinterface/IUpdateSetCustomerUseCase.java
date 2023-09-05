package com.autoclipper.si.domain.usecase.interfaces.setcustomerserviceusecaseinterface;

import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerRequest;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;

public interface IUpdateSetCustomerUseCase {
    ESetCustomerResponse updateSetCustomer(Integer id, ESetCustomerRequest eSetCustomerRequest);
}
