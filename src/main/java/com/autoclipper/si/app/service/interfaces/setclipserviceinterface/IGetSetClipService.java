package com.autoclipper.si.app.service.interfaces.setclipserviceinterface;

import com.autoclipper.si.domain.entities.setclipentities.ESetClipResponse;

import java.util.List;

public interface IGetSetClipService {
    List<ESetClipResponse> getAllSetClips();
    ESetClipResponse getSetClipById(Integer id);
}
