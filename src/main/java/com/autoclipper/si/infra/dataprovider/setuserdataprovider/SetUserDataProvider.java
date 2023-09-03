package com.autoclipper.si.infra.dataprovider.setuserdataprovider;

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
    public void delete(Integer id) {
        iSetUserRepository.delete(id);
    }

    @Override
    public ESetUserResponse updateSetUser(Integer id, ESetUserRequest eSetUserRequest) {
        SetUser existingSetUser = iSetUserRepository.findById(id);

        existingSetUser = setUserMapper.updateSetUserFromRequest(existingSetUser, eSetUserRequest);
        existingSetUser.persistAndFlush();

        return setUserMapper.eSetUserToESetUserResponse(existingSetUser);
    }

    @Override
    public ESetUserResponse getSetUserById(Integer id) {
        SetUser setUser = iSetUserRepository.findById(id);

        if (setUser == null) {
            // Tratar o caso em que o registro não foi encontrado (lançar exceção, retornar erro, etc.)
            // Exemplo: throw new NotFoundException("SetUser não encontrado com ID " + id);
        }

        return setUserMapper.eSetUserToESetUserResponse(setUser);
    }
}
