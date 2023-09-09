package com.autoclipper.si.app.service.interfaces.setcustomerserviceinterface;

import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerRequest;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;

public interface IUpdateSetCustomerService {
    ESetCustomerResponse updateSetCustomerId(Integer id, ESetCustomerRequest eSetCustomerRequest);


}
