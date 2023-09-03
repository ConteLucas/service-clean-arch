package com.autoclipper.si.app.service.interfaces;

import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;

import java.util.List;

public interface IGetSetLeadsService {
    List<ESetLeadsResponse> getAllSetLeads();
    ESetLeadsResponse getSetLeadsById(Integer id);
}
