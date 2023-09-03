package com.autoclipper.si.domain.usecase.interfaces;

import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;

import java.util.List;

public interface IGetSetVideoUseCase {
    List<ESetVideoResponse> getAll();
    ESetVideoResponse getSetVideoById(Integer id);
}
