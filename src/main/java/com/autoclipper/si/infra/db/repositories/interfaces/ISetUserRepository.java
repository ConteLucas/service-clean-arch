package com.autoclipper.si.infra.db.repositories.interfaces;

import com.autoclipper.si.infra.db.model.SetUser;
import com.autoclipper.si.infra.db.model.SetUser;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.List;

public interface ISetUserRepository extends PanacheRepositoryBase<SetUser, Integer> {
    SetUser save(SetUser setUser);
    List<SetUser> getAll();
    void delete(Integer id);
    SetUser updateSetUser(Integer leadId, SetUser updatedSetUser);

}
