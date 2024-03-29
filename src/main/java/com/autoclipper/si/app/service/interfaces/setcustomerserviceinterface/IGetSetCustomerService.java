package com.autoclipper.si.app.service.interfaces.setcustomerserviceinterface;

import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;

import java.util.List;

public interface IGetSetCustomerService {
    List<ESetCustomerResponse> getAllSetCustomers();
    ESetCustomerResponse getSetCustomerById(Integer id);
}
