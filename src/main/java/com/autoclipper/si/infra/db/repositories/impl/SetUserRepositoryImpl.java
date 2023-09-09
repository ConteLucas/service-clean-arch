package com.autoclipper.si.infra.db.repositories.impl;

import com.autoclipper.si.infra.db.model.SetUser;
import com.autoclipper.si.infra.db.model.SetUser;
import com.autoclipper.si.infra.db.repositories.interfaces.ISetUserRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

import static io.quarkus.hibernate.orm.panache.PanacheEntityBase.findById;
import static io.quarkus.hibernate.orm.panache.PanacheEntityBase.listAll;

@ApplicationScoped
public class SetUserRepositoryImpl implements ISetUserRepository {

    @Override
    public SetUser save(SetUser setUser) {
        setUser.persistAndFlush();
        return findById(setUser.getUserId());
    }
    @Override
    public List<SetUser> getAll() { return listAll(); }

    @Override
    public void delete(Integer id) {
        findById(id).persistAndFlush();
    }

    @Override
    public SetUser updateSetUser(Integer UserId, SetUser updatedSetUser){
        SetUser existingSetUser = findById(UserId);
        if(existingSetUser != null){
            existingSetUser.setUserPhone(updatedSetUser.getUserPhone());
            existingSetUser.setUserEmail(updatedSetUser.getUserEmail());
            existingSetUser.setUserPassword(updatedSetUser.getUserPassword());
            existingSetUser.setUserType(updatedSetUser.getUserType());
            return existingSetUser;
        }
        return null;
    }
}
