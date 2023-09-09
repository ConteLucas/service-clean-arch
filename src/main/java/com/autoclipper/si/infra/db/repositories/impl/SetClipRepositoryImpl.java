package com.autoclipper.si.infra.db.repositories.impl;

import com.autoclipper.si.infra.db.model.SetClip;
import com.autoclipper.si.infra.db.repositories.interfaces.ISetClipRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class SetClipRepositoryImpl implements ISetClipRepository {

    @Override
    public SetClip save(SetClip setClip) {
        setClip.persistAndFlush();
        return findById(setClip.getClipId()); }

    @Override
    public List<SetClip> getAll() {
        return listAll();
    }

    @Override
    public void delete(Integer id) { findById(id).persistAndFlush(); }

}
