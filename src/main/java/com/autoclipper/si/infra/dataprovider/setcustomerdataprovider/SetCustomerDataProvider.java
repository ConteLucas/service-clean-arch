package com.autoclipper.si.infra.dataprovider.setcustomerdataprovider;


import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerRequest;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;
import com.autoclipper.si.domain.gateway.ISetCustomerGateway;
import com.autoclipper.si.infra.db.model.SetCustomer;
import com.autoclipper.si.infra.db.repositories.interfaces.ISetCustomerRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class SetCustomerDataProvider implements ISetCustomerGateway {

    @Inject
    private ISetCustomerRepository iSetCustomerRepository;

    @Inject
    private SetCustomerMapper setCustomerMapper;

    @Override
    public ESetCustomerResponse save(ESetCustomerRequest eSetCustomerRequest) {
        SetCustomer setCustomer = setCustomerMapper.eSetCustomerToSetCustomer(eSetCustomerRequest);
        setCustomer = iSetCustomerRepository.save(setCustomer);
        return setCustomerMapper.eSetCustomerToESetCustomerResponse(setCustomer);
    }

    @Override
    public List<ESetCustomerResponse> getAll() {
        List<SetCustomer> all = iSetCustomerRepository.getAll();
        return setCustomerMapper.setListToESetListResponseList(all);
    }

    @Override
    public void delete(Integer id) {
        iSetCustomerRepository.delete(id);
    }

    @Override
    public ESetCustomerResponse updateSetCustomer(Integer id, ESetCustomerRequest eSetCustomerRequest) {
        SetCustomer existingSetCustomer = iSetCustomerRepository.findById(id);

        if (existingSetCustomer == null) {
            // Lançar exceção ou retornar erro adequado, pois o registro não foi encontrado
            // Exemplo: throw new NotFoundException("SetCustomer não encontrado com ID " + id);
        }
        existingSetCustomer = setCustomerMapper.updateSetCustomerFromRequest(existingSetCustomer, eSetCustomerRequest);
        existingSetCustomer.persistAndFlush();

        return setCustomerMapper.eSetCustomerToESetCustomerResponse(existingSetCustomer);
    }
    @Override
    public ESetCustomerResponse getSetCustomerById(Integer id) {
        // Busque o SetCustomer com o ID especificado no banco de dados
        SetCustomer setCustomer = iSetCustomerRepository.findById(id);

        if (setCustomer == null) {
            // Lançar exceção ou retornar erro adequado, pois o registro não foi encontrado
            // Exemplo: throw new NotFoundException("SetCustomer não encontrado com ID " + id);
        }

        // Mapeie o SetCustomer encontrado para ESetCustomerResponse e retorne
        return setCustomerMapper.eSetCustomerToESetCustomerResponse(setCustomer);
    }
}
