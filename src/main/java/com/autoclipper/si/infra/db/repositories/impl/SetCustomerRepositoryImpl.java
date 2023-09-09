package com.autoclipper.si.infra.db.repositories.impl;

import com.autoclipper.si.app.service.cross.InternalRuntimeException;
import com.autoclipper.si.infra.db.model.SetCustomer;
import com.autoclipper.si.infra.db.repositories.interfaces.ISetCustomerRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class SetCustomerRepositoryImpl implements ISetCustomerRepository {

    @Override
    public SetCustomer save(SetCustomer setCustomer) {
        setCustomer.persistAndFlush();
        return findById(setCustomer.getCustomerId());
    }

    @Override
    public List<SetCustomer> getAll() {
        return listAll();
    }

    @Override
    public void delete(Integer id) {
        findById(id).persistAndFlush();
    }

    @Override
    public SetCustomer updateSetCustomer(Integer customerId, SetCustomer updatedSetCustomer) {
        SetCustomer existingSeCustomer = findById(customerId);
        if(existingSeCustomer != null){
            existingSeCustomer.setCustomerName(updatedSetCustomer.getCustomerName());
            existingSeCustomer.setCustomerCep(updatedSetCustomer.getCustomerCep());
            existingSeCustomer.setCustomerAddress(updatedSetCustomer.getCustomerAddress());
            existingSeCustomer.setCustomerPhone(updatedSetCustomer.getCustomerPhone());
            existingSeCustomer.setCustomerCpfCnpj(updatedSetCustomer.getCustomerCpfCnpj());
            return existingSeCustomer;
        }
        return null;
    }


}
