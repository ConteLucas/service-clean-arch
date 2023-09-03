package com.autoclipper.si.app.service.interfaces;

import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;

public interface ISaveSetLeadsService {
    ESetLeadsResponse saveSetLeads(ESetLeadsRequest eSetLeadsRequest);
}
