package com.autoclipper.si.app.service.impl.setuserserviceimpl;

import com.autoclipper.si.app.service.interfaces.setuserserviceinterface.ISaveSetUserService;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserRequest;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;
import com.autoclipper.si.domain.usecase.interfaces.setuserserviceusecaseinterface.ISaveSetUserUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class SaveSetUserServiceImpl implements ISaveSetUserService {

    @Inject
    private ISaveSetUserUseCase saveSetUserUseCase;

    @Override
    public ESetUserResponse saveSetUser(ESetUserRequest eSetUserRequest) {
        return saveSetUserUseCase.save(eSetUserRequest);
    }
}
