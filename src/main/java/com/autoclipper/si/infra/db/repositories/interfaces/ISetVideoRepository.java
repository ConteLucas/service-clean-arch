package com.autoclipper.si.infra.db.repositories.interfaces;

import com.autoclipper.si.infra.db.model.SetVideo;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.List;

public interface ISetVideoRepository extends PanacheRepositoryBase<SetVideo, Integer> {
    SetVideo save(SetVideo setVideo);
    List<SetVideo> getAll();
    void delete(Integer id);
}
