package com.autoclipper.si.infra.dataprovider.setcustomerdataprovider;

import com.autoclipper.si.app.service.cross.InternalRuntimeException;
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
    public ESetCustomerResponse updateSetCustomerId(Integer id, ESetCustomerRequest eSetCustomerRequest) {
        SetCustomer existingSetCustomer = iSetCustomerRepository.findById(id);
        if (existingSetCustomer != null) {
            existingSetCustomer = setCustomerMapper.updateSetCustomerFromRequest(existingSetCustomer, eSetCustomerRequest);
            existingSetCustomer.persistAndFlush();
            return setCustomerMapper.eSetCustomerToESetCustomerResponse(existingSetCustomer);
        }
        throw new InternalRuntimeException("SetCustomer não encontrado com ID " + id);
    }
    @Override
    public ESetCustomerResponse getSetCustomerById(Integer id) {
        SetCustomer setCustomer = iSetCustomerRepository.findById(id);
        if (setCustomer == null) { return setCustomerMapper.eSetCustomerToESetCustomerResponse(setCustomer); }
        throw new InternalRuntimeException("SetCustomer não encontrado com ID " + id);
    }
    @Override
    public void delete(Integer id) {
        iSetCustomerRepository.delete(id);
    }
}
