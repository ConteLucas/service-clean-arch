package com.autoclipper.si.infra.dataprovider.setuserdataprovider;

import com.autoclipper.si.app.service.cross.InternalRuntimeException;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserRequest;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;
import com.autoclipper.si.domain.gateway.ISetUserGateway;
import com.autoclipper.si.infra.db.model.SetUser;
import com.autoclipper.si.infra.db.repositories.interfaces.ISetUserRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
public class SetUserDataProvider implements ISetUserGateway {
    @Inject
    private ISetUserRepository iSetUserRepository;
    @Inject
    private SetUserMapper setUserMapper;
    @Override
    public ESetUserResponse save(ESetUserRequest eSetUserRequest) {
        SetUser setUser = setUserMapper.eSetUserToSetUser(eSetUserRequest);
        setUser = iSetUserRepository.save(setUser);
        return setUserMapper.eSetUserToESetUserResponse(setUser);
    }
    @Override
    public List<ESetUserResponse> getAll() {
        List<SetUser> all = iSetUserRepository.getAll();
        return setUserMapper.setUserListToESetUserListResponseList(all);
    }
    @Override
    public ESetUserResponse updateSetUser(Integer id, ESetUserRequest eSetUserRequest) {
        SetUser existingSetUser = iSetUserRepository.findById(id);
        if (existingSetUser != null) {
            existingSetUser.setUserPhone(eSetUserRequest.getUserPhone());
            existingSetUser.setUserEmail(eSetUserRequest.getUserEmail());
            existingSetUser.setUserPassword(existingSetUser.getUserPassword());
            existingSetUser.setUserType(existingSetUser.getUserType());
            existingSetUser.persistAndFlush();
            return setUserMapper.eSetUserToESetUserResponse(existingSetUser);
        }
        throw new InternalRuntimeException("SetUser não encontrado com ID " + id);
    }
    @Override
    public ESetUserResponse getSetUserById(Integer id) {
        SetUser setUser = iSetUserRepository.findById(id);
        if (setUser != null) { return setUserMapper.eSetUserToESetUserResponse(setUser); }
        throw new InternalRuntimeException("SetUser não encontrado com ID " + id);
    }
    @Override
    public void delete(Integer id) {
        iSetUserRepository.delete(id);
    }
}
