package com.autoclipper.si.domain.usecase.interfaces;

import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerRequest;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;

public interface ISaveSetCustomerUseCase {
    ESetCustomerResponse save(ESetCustomerRequest eSetCustomerRequest);
}
