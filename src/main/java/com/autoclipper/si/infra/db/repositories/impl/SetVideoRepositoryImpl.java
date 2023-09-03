package com.autoclipper.si.infra.db.repositories.impl;

import com.autoclipper.si.infra.db.model.SetVideo;
import com.autoclipper.si.infra.db.repositories.interfaces.ISetVideoRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

import static io.quarkus.hibernate.orm.panache.PanacheEntityBase.findById;
import static io.quarkus.hibernate.orm.panache.PanacheEntityBase.listAll;

@ApplicationScoped
public class SetVideoRepositoryImpl implements ISetVideoRepository {

    @Override
    public SetVideo save(SetVideo setVideo) {
        setVideo.persistAndFlush();
        return findById(setVideo.getVideoId());
    }

    @Override
    public List<SetVideo> getAll() {
        return listAll();
    }

    @Override
    public void delete(Integer id) {
        SetVideo.deleteById(id);
    }

    @Override
    public SetVideo findById(Integer id) {
        return findById(id);
    }
}
