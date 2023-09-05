package com.autoclipper.si.app.service.interfaces.setclipserviceinterface;

import com.autoclipper.si.domain.entities.setclipentities.ESetClipRequest;
import com.autoclipper.si.domain.entities.setclipentities.ESetClipResponse;

public interface ISaveSetClipService {
    ESetClipResponse saveSetClip(ESetClipRequest eSetClipRequest);
}
