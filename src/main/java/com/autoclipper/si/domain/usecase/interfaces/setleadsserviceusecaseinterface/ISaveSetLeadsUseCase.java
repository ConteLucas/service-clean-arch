package com.autoclipper.si.domain.usecase.interfaces.setleadsserviceusecaseinterface;

import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;

public interface ISaveSetLeadsUseCase {
    ESetLeadsResponse save(ESetLeadsRequest eSetLeadsRequest);
}
