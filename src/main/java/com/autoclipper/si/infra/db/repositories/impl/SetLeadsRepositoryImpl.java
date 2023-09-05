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
        return findById(setLeads.getLeadId());
    }
    @Override
    public List<SetLeads> getAll() {
        return listAll();
    }

    @Override
    public void delete(Integer id) {
        SetLeads res = findById(id);
        res.setLeadStatus("inactive");
        res.persistAndFlush();
    }

    @Override
    public SetLeads updateSetLeads(Integer leadId, SetLeads updatedSetLeads){
        SetLeads existingSetLeads = findById(leadId);
        if(existingSetLeads != null){
            existingSetLeads.setLeadName(updatedSetLeads.getLeadName());
            existingSetLeads.setLeadEmail(updatedSetLeads.getLeadEmail());
            existingSetLeads.setLeadPhone(updatedSetLeads.getLeadPhone());
            existingSetLeads.setLeadStatus(updatedSetLeads.getLeadStatus());
            existingSetLeads.setLeadSource(updatedSetLeads.getLeadSource());
            return existingSetLeads;
        }
        return null;
    }

}
