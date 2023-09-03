package com.autoclipper.si.infra.db.repositories.impl;

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
    public List<SetUser> getAll() {
        return listAll();
    }

    @Override
    public void delete(Integer id) {
        SetUser.deleteById(id);
    }

    @Override
    public SetUser findById(Integer id) {
        return findById(id);
    }
}
