package com.autoclipper.si.infra.db.repositories.impl;

import com.autoclipper.si.infra.db.model.SetCustomer;
import com.autoclipper.si.infra.db.repositories.interfaces.ISetCustomerRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

import static io.quarkus.hibernate.orm.panache.PanacheEntityBase.findById;
import static io.quarkus.hibernate.orm.panache.PanacheEntityBase.listAll;

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
        SetCustomer.deleteById(id);
    }

    @Override
    public SetCustomer findById(Integer id) {
        return findById(id);
    }
}
