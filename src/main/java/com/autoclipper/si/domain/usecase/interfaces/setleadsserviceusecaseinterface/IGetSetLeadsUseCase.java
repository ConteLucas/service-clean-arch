package com.autoclipper.si.domain.usecase.interfaces.setleadsserviceusecaseinterface;

import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;

import java.util.List;

public interface IGetSetLeadsUseCase {
    List<ESetLeadsResponse> getAll();
    ESetLeadsResponse getSetLeadsById(Integer id);
}
