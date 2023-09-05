package com.autoclipper.si.domain.usecase.interfaces.setclipserviceusecaseinterface;

import com.autoclipper.si.domain.entities.setclipentities.ESetClipResponse;

import java.util.List;

public interface IGetSetClipUseCase {
    List<ESetClipResponse> getAll();
    ESetClipResponse getSetClipById(Integer id);
}
