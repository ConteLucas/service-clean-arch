package com.autoclipper.si.infra.db.repositories.impl;

import com.autoclipper.si.infra.db.model.SetClip;
import com.autoclipper.si.infra.db.repositories.interfaces.ISetClipRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

import static io.quarkus.hibernate.orm.panache.PanacheEntityBase.findById;
import static io.quarkus.hibernate.orm.panache.PanacheEntityBase.listAll;

@ApplicationScoped
public class SetClipRepositoryImpl implements ISetClipRepository {

    @Override
    public SetClip save(SetClip setClip) {
        setClip.persistAndFlush();
        return setClip;
    }

    @Override
    public List<SetClip> getAll() {
        return listAll();
    }

    @Override
    public void delete(Integer id) {
        SetClip.deleteById(id);
    }

    @Override
    public SetClip findById(Integer id) {
        return findById(id);
    }
}
