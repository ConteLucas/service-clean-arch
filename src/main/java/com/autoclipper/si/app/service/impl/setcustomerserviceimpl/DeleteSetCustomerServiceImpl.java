package com.autoclipper.si.app.service.impl.setcustomerserviceimpl;

import com.autoclipper.si.app.service.interfaces.setcustomerserviceinterface.IDeleteSetCustomerService;
import com.autoclipper.si.domain.usecase.interfaces.setcustomerserviceusecaseinterface.IDeleteSetCustomerUseCase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class DeleteSetCustomerServiceImpl implements IDeleteSetCustomerService {

    @Inject
    private IDeleteSetCustomerUseCase deleteSetCustomerUseCase;

    @Override
    public void deleteSetCustomer(Integer id) {
        deleteSetCustomerUseCase.delete(id);
    }
}
