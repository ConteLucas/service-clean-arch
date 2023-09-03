package com.autoclipper.si.infra.db.repositories.interfaces;

import com.autoclipper.si.infra.db.model.SetLeads;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.List;

public interface ISetLeadsRepository extends PanacheRepositoryBase<SetLeads, Integer> {
    SetLeads save(SetLeads setLeadConfig);

    List<SetLeads> getAll();

    void delete(Integer id);

    SetLeads findById(Integer id);
}