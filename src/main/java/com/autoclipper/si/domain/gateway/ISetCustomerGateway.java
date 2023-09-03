package com.autoclipper.si.domain.gateway;

import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerRequest;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;

import java.util.List;

public interface ISetCustomerGateway {
    ESetCustomerResponse save(ESetCustomerRequest eSetCustomerRequest);

    List<ESetCustomerResponse> getAll();

    void delete(Integer id);

    ESetCustomerResponse updateSetCustomer(Integer id, ESetCustomerRequest eSetCustomerRequest);

    ESetCustomerResponse getSetCustomerById(Integer id);
}
