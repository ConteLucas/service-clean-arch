package com.autoclipper.si.app.service.impl.setvideoserviceimpl;

import com.autoclipper.si.app.service.interfaces.setvideoserviceinterface.IGetSetVideoService;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;
import com.autoclipper.si.domain.usecase.interfaces.setvideoserviceusecaseinterface.IGetSetVideoUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class GetSetVideoServiceImpl implements IGetSetVideoService {

    @Inject
    private IGetSetVideoUseCase getSetVideoUseCase;

    @Override
    public List<ESetVideoResponse> getAllSetVideos() {
        return getSetVideoUseCase.getAll();
    }

    @Override
    public ESetVideoResponse getSetVideoById(Integer id) {
        return getSetVideoUseCase.getSetVideoById(id);
    }
}
