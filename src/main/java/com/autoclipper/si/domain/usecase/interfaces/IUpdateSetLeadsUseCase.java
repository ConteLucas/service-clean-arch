package com.autoclipper.si.domain.usecase.interfaces;

import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;

public interface IUpdateSetLeadsUseCase {
    ESetLeadsResponse updateSetLeads(Integer id, ESetLeadsRequest eSetLeadsRequest);
}
