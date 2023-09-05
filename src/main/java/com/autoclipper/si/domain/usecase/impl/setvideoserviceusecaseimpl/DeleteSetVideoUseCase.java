package com.autoclipper.si.domain.usecase.impl.setvideoserviceusecaseimpl;

import com.autoclipper.si.domain.gateway.ISetVideoGateway;
import com.autoclipper.si.domain.usecase.interfaces.setvideoserviceusecaseinterface.IDeleteSetVideoUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class DeleteSetVideoUseCase implements IDeleteSetVideoUseCase {

    @Inject
    private ISetVideoGateway iSetVideoGateway;

    @Override
    @Transactional
    public void delete(Integer id) {
        iSetVideoGateway.delete(id);
    }
}
