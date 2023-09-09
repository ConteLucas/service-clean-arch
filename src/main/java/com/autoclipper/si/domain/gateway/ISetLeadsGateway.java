package com.autoclipper.si.domain.gateway;

import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;

import java.util.List;

public interface ISetLeadsGateway {
    ESetLeadsResponse save(ESetLeadsRequest eSetLeadsRequest);
    List<ESetLeadsResponse> getAll();
    void delete(Integer id);
    ESetLeadsResponse updateSetLeads(Integer id, ESetLeadsRequest eSetLeadsRequest);
    ESetLeadsResponse getSetLeadsById(Integer id);
}
