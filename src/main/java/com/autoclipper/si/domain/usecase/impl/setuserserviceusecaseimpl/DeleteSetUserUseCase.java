package com.autoclipper.si.domain.usecase.impl.setuserserviceusecaseimpl;

import com.autoclipper.si.domain.gateway.ISetUserGateway;
import com.autoclipper.si.domain.usecase.interfaces.setuserserviceusecaseinterface.IDeleteSetUserUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class DeleteSetUserUseCase implements IDeleteSetUserUseCase {

    @Inject
    private ISetUserGateway iSetUserGateway;

    @Override
    @Transactional
    public void delete(Integer id) {
        iSetUserGateway.delete(id);
    }
}
