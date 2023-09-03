package com.autoclipper.si.infra.dataprovider.setleadsdataprovider;

import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;
import com.autoclipper.si.infra.db.model.SetLeads;
import groovy.util.logging.Log4j2;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
@Log4j2
public class SetLeadsMapper   {
    public SetLeads eSetLeadsToSetLeads(ESetLeadsRequest eSetLeadsRequest){
        if (Objects.nonNull(eSetLeadsRequest)) {
            return SetLeads.builder()
                    .leadId(eSetLeadsRequest.getLeadId())
                    .leadName(eSetLeadsRequest.getLeadName())
                    .leadEmail(eSetLeadsRequest.getLeadEmail())
                    .leadPhone(eSetLeadsRequest.getLeadPhone())
                    .leadStatus(eSetLeadsRequest.getLeadStatus())
                    .leadSource(eSetLeadsRequest.getLeadSource())
                    .build();
        }
        throw new NullPointerException("NullPointerException set_leads/SetLeadsMapper");
    }

    public ESetLeadsResponse eSetLeadsToESetLeadsResponse(SetLeads setLeads){
        if (Objects.nonNull(setLeads)) {
            return ESetLeadsResponse.builder()
                    .leadId(setLeads.getLeadId())
                    .leadName(setLeads.getLeadName())
                    .leadEmail(setLeads.getLeadEmail())
                    .leadPhone(setLeads.getLeadPhone())
                    .leadStatus(setLeads.getLeadStatus())
                    .leadSource(setLeads.getLeadSource())
                    .build();
        }
        throw new NullPointerException("NullPointerException set_leads/SetLeadsMapper");
    }

    public List<ESetLeadsResponse> setListToESetListResponseList(List<SetLeads> all){
        return all.stream().map(this::eSetLeadsToESetLeadsResponse).collect(Collectors.toList());
    }

    public SetLeads updateSetLeadsFromRequest(SetLeads existingSetLeads, ESetLeadsRequest eSetLeadsRequest){
        existingSetLeads.setLeadName(eSetLeadsRequest.getLeadName());
        existingSetLeads.setLeadEmail(eSetLeadsRequest.getLeadEmail());
        existingSetLeads.setLeadPhone(eSetLeadsRequest.getLeadPhone());
        existingSetLeads.setLeadStatus(eSetLeadsRequest.getLeadStatus());
        existingSetLeads.setLeadSource(eSetLeadsRequest.getLeadSource());
        return existingSetLeads;
    }

}