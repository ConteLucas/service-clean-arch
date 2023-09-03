package com.autoclipper.si.infra.db.repositories.impl;

import com.autoclipper.si.infra.db.model.SetLeads;
import com.autoclipper.si.infra.db.repositories.interfaces.ISetLeadsRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;


@ApplicationScoped
public class SetLeadsRepositoryImpl implements ISetLeadsRepository {

    @Override
    public SetLeads save(SetLeads setLeads) {
        setLeads.persistAndFlush();
        return setLeads;
    }

    @Override
    public List<SetLeads> getAll() {
        return listAll();
    }

    @Override
    public void delete(Integer id) {
        SetLeads.deleteById(id);
    }

    @Override
    public SetLeads findById(Integer id) {
        return findById(id);
    }
}
