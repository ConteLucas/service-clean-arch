package com.autoclipper.si.app.service.impl.setuserserviceimpl;

import com.autoclipper.si.app.service.interfaces.setuserserviceinterface.IUpdateSetUserService;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserRequest;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;
import com.autoclipper.si.domain.usecase.interfaces.setvideoprocessingserviceusecaseinterface.IUpdateSetUserUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class UpdateSetUserServiceImpl implements IUpdateSetUserService {

    @Inject
    private IUpdateSetUserUseCase updateSetUserUseCase;

    @Override
    @Transactional
    public ESetUserResponse updateSetUser(Integer id, ESetUserRequest eSetUserRequest) {
        return updateSetUserUseCase.updateSetUser(id, eSetUserRequest);
    }


}
