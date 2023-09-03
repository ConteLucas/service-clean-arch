package com.autoclipper.si.domain.gateway;

import com.autoclipper.si.domain.entities.setclipentities.ESetClipRequest;
import com.autoclipper.si.domain.entities.setclipentities.ESetClipResponse;

import java.util.List;

public interface ISetClipGateway {

    ESetClipResponse save(ESetClipRequest eSetClipRequest);

    List<ESetClipResponse> getAll();

    void delete(Integer id);

    ESetClipResponse updateSetClip(Integer id, ESetClipRequest eSetClipRequest);

    ESetClipResponse getSetClipById(Integer id);
}
