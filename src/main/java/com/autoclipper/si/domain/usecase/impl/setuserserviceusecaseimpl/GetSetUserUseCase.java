package com.autoclipper.si.domain.usecase.impl.setuserserviceusecaseimpl;

import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;
import com.autoclipper.si.domain.gateway.ISetUserGateway;
import com.autoclipper.si.domain.usecase.interfaces.setuserserviceusecaseinterface.IGetSetUserUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class GetSetUserUseCase implements IGetSetUserUseCase {

    @Inject
    private ISetUserGateway iSetUserGateway;

    @Override
    public List<ESetUserResponse> getAll() {
        return iSetUserGateway.getAll();
    }

    @Override
    public ESetUserResponse getSetUserById(Integer id) {
        return iSetUserGateway.getSetUserById(id);
    }
}
