package com.autoclipper.si.infra.dataprovider.setleadsdataprovider;

import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;
import com.autoclipper.si.domain.gateway.ISetLeadsGateway;
import com.autoclipper.si.infra.db.model.SetLeads;
import com.autoclipper.si.infra.db.repositories.interfaces.ISetLeadsRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class SetLeadsDataProvider implements ISetLeadsGateway {

    @Inject
    private ISetLeadsRepository iSetLeadsRepository;

    @Inject
    private SetLeadsMapper setLeadsMapper;

    @Override
    public ESetLeadsResponse save(ESetLeadsRequest eSetLeadsRequest) {
        // Mapeia todos os campos eSetLeadsRequest para SetLeads
        SetLeads setLeads = setLeadsMapper.eSetLeadsToSetLeads(eSetLeadsRequest);

        // Salva no banco de dados
        setLeads = iSetLeadsRepository.save(setLeads);

        // Mapeia o resultado para ESetLeadsResponse
        return setLeadsMapper.eSetLeadsToESetLeadsResponse(setLeads);
    }

    @Override
    public List<ESetLeadsResponse> getAll() {
        List<SetLeads> all = iSetLeadsRepository.getAll();

        // Mapeia a lista de SetLeads para uma lista de ESetLeadsResponse
        return setLeadsMapper.setListToESetListResponseList(all);
    }

    @Override
    public void delete(Integer id) {
        iSetLeadsRepository.delete(id);
    }

    @Override
    public ESetLeadsResponse updateSetLeads(Integer id, ESetLeadsRequest eSetLeadsRequest) {
        // Primeiro, verifique se o SetLeads com o ID existe no banco de dados
        SetLeads existingSetLeads = iSetLeadsRepository.findById(id);
        existingSetLeads = setLeadsMapper.updateSetLeadsFromRequest(existingSetLeads, eSetLeadsRequest);
        // Salve as alterações no banco de dados
        existingSetLeads.persistAndFlush();
        // Mapeie o SetLeads atualizado para ESetLeadsResponse e retorne
        return setLeadsMapper.eSetLeadsToESetLeadsResponse(existingSetLeads);
    }

    @Override
    public ESetLeadsResponse getSetLeadsById(Integer id) {
        // Busque o SetLeads com o ID especificado no banco de dados
        SetLeads setLeads = iSetLeadsRepository.findById(id);

        if (setLeads == null) {
            // Lançar exceção ou retornar erro adequado, pois o registro não foi encontrado
            // Exemplo: throw new NotFoundException("SetLeads não encontrado com ID " + id);
        }

        // Mapeie o SetLeads encontrado para ESetLeadsResponse e retorne
        return setLeadsMapper.eSetLeadsToESetLeadsResponse(setLeads);
    }
}