package com.autoclipper.si.app.service.impl.setuserserviceimpl;

import com.autoclipper.si.app.service.interfaces.setuserserviceinterface.IDeleteSetUserService;
import com.autoclipper.si.domain.usecase.interfaces.setuserserviceusecaseinterface.IDeleteSetUserUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class DeleteSetUserServiceImpl implements IDeleteSetUserService {

    @Inject
    private IDeleteSetUserUseCase deleteSetUserUseCase;

    @Override
    public void deleteSetUser(Integer id) {
        deleteSetUserUseCase.delete(id);
    }
}
