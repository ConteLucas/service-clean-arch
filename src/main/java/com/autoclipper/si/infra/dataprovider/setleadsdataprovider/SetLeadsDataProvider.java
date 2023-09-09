package com.autoclipper.si.infra.dataprovider.setleadsdataprovider;

import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;
import com.autoclipper.si.domain.gateway.ISetLeadsGateway;
import com.autoclipper.si.infra.db.model.SetLeads;
import com.autoclipper.si.infra.db.repositories.interfaces.ISetLeadsRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.NotFoundException;

import java.util.List;

@ApplicationScoped
public class SetLeadsDataProvider implements ISetLeadsGateway {

    @Inject
    private ISetLeadsRepository iSetLeadsRepository;

    @Inject
    private SetLeadsMapper setLeadsMapper;

    @Override
    public ESetLeadsResponse save(ESetLeadsRequest eSetLeadsRequest) {
        SetLeads setLeads = setLeadsMapper.eSetLeadsToSetLeads(eSetLeadsRequest);
        setLeads = iSetLeadsRepository.save(setLeads);
        return setLeadsMapper.eSetLeadsToESetLeadsResponse(setLeads);
    }

    @Override
    public List<ESetLeadsResponse> getAll() {
        List<SetLeads> all = iSetLeadsRepository.getAll();
        return setLeadsMapper.setListToESetListResponseList(all);
    }

    @Override
    public ESetLeadsResponse updateSetLeads(Integer id, ESetLeadsRequest eSetLeadsRequest) {
        SetLeads existingSetLeads = iSetLeadsRepository.findById(id);
        if (existingSetLeads != null) {
            existingSetLeads.setLeadName(eSetLeadsRequest.getLeadName());
            existingSetLeads.setLeadEmail(eSetLeadsRequest.getLeadEmail());
            existingSetLeads.setLeadPhone(eSetLeadsRequest.getLeadPhone());
            existingSetLeads.setLeadStatus(eSetLeadsRequest.getLeadStatus());
            existingSetLeads.setLeadSource(eSetLeadsRequest.getLeadSource());
            existingSetLeads.persistAndFlush();
            return setLeadsMapper.eSetLeadsToESetLeadsResponse(existingSetLeads);
        }
         throw new NotFoundException("SetLeads não encontrados ocm ID " + id);
    }

    @Override
    public ESetLeadsResponse getSetLeadsById(Integer id) {
        SetLeads setLeads = iSetLeadsRepository.findById(id);
        if (setLeads != null) {
            return setLeadsMapper.eSetLeadsToESetLeadsResponse(setLeads);
        }
        throw new NotFoundException("SetLeads não encontrado com ID " + id);
    }

    public void delete(Integer id){ iSetLeadsRepository.delete(id);}
}