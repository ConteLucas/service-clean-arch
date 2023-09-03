package com.autoclipper.si.app.service.impl;

import com.autoclipper.si.app.service.interfaces.IDeleteSetUserService;
import com.autoclipper.si.domain.usecase.interfaces.IDeleteSetUserUseCase;
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
