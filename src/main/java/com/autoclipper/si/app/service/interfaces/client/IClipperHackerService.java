package com.autoclipper.si.app.service.interfaces.client;

import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerRequest;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;

public interface IClipperHackerService {
    ESetCustomerResponse saveMessageTsuruToClipperHacker (ESetCustomerRequest eSetCustomerRequest);

}
