package com.autoclipper.si.app.service.impl.setvideoserviceimpl;

import com.autoclipper.si.app.service.interfaces.setvideoserviceinterface.IDeleteSetVideoService;
import com.autoclipper.si.domain.usecase.interfaces.setvideoserviceusecaseinterface.IDeleteSetVideoUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class DeleteSetVideoServiceImpl implements IDeleteSetVideoService {

    @Inject
    private IDeleteSetVideoUseCase deleteSetVideoUseCase;

    @Override
    public void deleteSetVideo(Integer id) {
        deleteSetVideoUseCase.delete(id);
    }
}
