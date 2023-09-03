package com.autoclipper.si.infra.db.repositories.impl;

import com.autoclipper.si.infra.db.model.SetVideoProcessing;
import com.autoclipper.si.infra.db.repositories.interfaces.ISetVideoProcessingRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

import static io.quarkus.hibernate.orm.panache.PanacheEntityBase.findById;
import static io.quarkus.hibernate.orm.panache.PanacheEntityBase.listAll;

@ApplicationScoped
public class SetVideoProcessingRepositoryImpl implements ISetVideoProcessingRepository {

    @Override
    public SetVideoProcessing save(SetVideoProcessing videoProcessing) {
        videoProcessing.persistAndFlush();
        return findById(videoProcessing.getProcessId());
    }

    @Override
    public List<SetVideoProcessing> getAll() {
        return listAll();
    }

    @Override
    public void delete(Integer id) {
        SetVideoProcessing.deleteById(id);
    }

    @Override
    public SetVideoProcessing findById(Integer id) {
        return findById(id);
    }
}
