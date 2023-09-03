package com.autoclipper.si.infra.dataprovider.setclipdataprovider;


import com.autoclipper.si.domain.entities.setclipentities.ESetClipRequest;
import com.autoclipper.si.domain.entities.setclipentities.ESetClipResponse;
import com.autoclipper.si.infra.dataprovider.Clip.SetClipMapper;
import com.autoclipper.si.domain.gateway.ISetClipGateway;
import com.autoclipper.si.infra.db.model.SetClip;
import com.autoclipper.si.infra.db.repositories.interfaces.ISetClipRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class SetClipDataProvider implements ISetClipGateway {

    @Inject
    private ISetClipRepository iSetClipRepository;

    @Inject
    private SetClipMapper setClipMapper;

    @Override
    public ESetClipResponse save(ESetClipRequest eSetClipRequest) {
        SetClip setClip = setClipMapper.eSetClipToSetClip(eSetClipRequest);
        setClip = iSetClipRepository.save(setClip);
        return setClipMapper.eSetClipToESetClipResponse(setClip);
    }

    @Override
    public List<ESetClipResponse> getAll() {
        List<SetClip> all = iSetClipRepository.getAll();
        return setClipMapper.setListToESetListResponseList(all);
    }

    @Override
    public void delete(Integer id) {
        iSetClipRepository.delete(id);
    }

    @Override
    public ESetClipResponse updateSetClip(Integer id, ESetClipRequest eSetClipRequest) {
        SetClip existingSetClip = iSetClipRepository.findById(id);

        if (existingSetClip == null) {
            // Lançar exceção ou retornar erro adequado, pois o registro não foi encontrado
            // Exemplo: throw new NotFoundException("SetClip não encontrado com ID " + id);
        }
        existingSetClip = setClipMapper.updateSetClipFromRequest(existingSetClip, eSetClipRequest);
        existingSetClip.persistAndFlush();

        return setClipMapper.eSetClipToESetClipResponse(existingSetClip);
    }
    @Override
    public ESetClipResponse getSetClipById(Integer id) {
        // Busque o SetClip com o ID especificado no banco de dados
        SetClip setClip = iSetClipRepository.findById(id);

        if (setClip == null) {
            // Lançar exceção ou retornar erro adequado, pois o registro não foi encontrado
            // Exemplo: throw new NotFoundException("SetClip não encontrado com ID " + id);
        }

        // Mapeie o SetClip encontrado para ESetClipResponse e retorne
        return setClipMapper.eSetClipToESetClipResponse(setClip);
    }
}
