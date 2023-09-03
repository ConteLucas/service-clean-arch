package com.autoclipper.si.infra.db.repositories.interfaces;

import com.autoclipper.si.infra.db.model.SetVideoProcessing;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.List;

public interface ISetVideoProcessingRepository extends PanacheRepositoryBase<SetVideoProcessing, Integer> {
    SetVideoProcessing save(SetVideoProcessing videoProcessing);

    List<SetVideoProcessing> getAll();

    void delete(Integer id);

    SetVideoProcessing findById(Integer id);
}
