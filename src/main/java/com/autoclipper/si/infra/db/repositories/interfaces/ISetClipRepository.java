package com.autoclipper.si.infra.db.repositories.interfaces;

import com.autoclipper.si.infra.db.model.SetClip;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.List;

public interface ISetClipRepository extends PanacheRepositoryBase<SetClip, Integer> {
    SetClip save(SetClip setClip);
    List<SetClip> getAll();
    void delete(Integer id);

}
