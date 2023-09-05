package com.autoclipper.si.app.service.impl.setuserserviceimpl;

import com.autoclipper.si.app.service.interfaces.setuserserviceinterface.IGetSetUserService;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;
import com.autoclipper.si.domain.usecase.interfaces.setuserserviceusecaseinterface.IGetSetUserUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class GetSetUserServiceImpl implements IGetSetUserService {

    @Inject
    private IGetSetUserUseCase getSetUserUseCase;

    @Override
    public List<ESetUserResponse> getAllSetUsers() {
        return getSetUserUseCase.getAll();
    }

    @Override
    public ESetUserResponse getSetUserById(Integer id) {
        return getSetUserUseCase.getSetUserById(id);
    }
}
