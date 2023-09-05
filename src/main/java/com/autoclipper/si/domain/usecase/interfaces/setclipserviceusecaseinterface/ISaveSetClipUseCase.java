package com.autoclipper.si.domain.usecase.interfaces.setclipserviceusecaseinterface;

import com.autoclipper.si.domain.entities.setclipentities.ESetClipRequest;
import com.autoclipper.si.domain.entities.setclipentities.ESetClipResponse;

public interface ISaveSetClipUseCase {
    ESetClipResponse save(ESetClipRequest eSetClipRequest);
}
