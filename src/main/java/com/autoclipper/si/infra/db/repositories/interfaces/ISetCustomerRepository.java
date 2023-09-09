package com.autoclipper.si.infra.db.repositories.interfaces;

import com.autoclipper.si.infra.db.model.SetCustomer;
import com.autoclipper.si.infra.db.model.SetLeads;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.List;

public interface ISetCustomerRepository extends PanacheRepositoryBase<SetCustomer, Integer> {
    SetCustomer save(SetCustomer setCustomer);
    List<SetCustomer> getAll();
    void delete(Integer id);
    SetCustomer updateSetCustomer(Integer customerId, SetCustomer updatedSetCustomer);
}
