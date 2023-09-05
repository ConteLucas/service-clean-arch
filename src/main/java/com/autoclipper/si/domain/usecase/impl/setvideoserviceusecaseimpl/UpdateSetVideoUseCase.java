package com.autoclipper.si.domain.usecase.impl.setvideoserviceusecaseimpl;

import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoRequest;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;
import com.autoclipper.si.domain.gateway.ISetVideoGateway;
import com.autoclipper.si.domain.usecase.interfaces.setvideoserviceusecaseinterface.IUpdateSetVideoUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class UpdateSetVideoUseCase implements IUpdateSetVideoUseCase {

    @Inject
    private ISetVideoGateway iSetVideoGateway;

    @Override
    @Transactional
    public ESetVideoResponse updateSetVideo(Integer id, ESetVideoRequest eSetVideoRequest) {
        return iSetVideoGateway.updateSetVideo(id, eSetVideoRequest);
    }
}
