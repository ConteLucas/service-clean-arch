package com.autoclipper.si.infra.dataprovider.setvideodataprovider;

import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingRequest;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;
import com.autoclipper.si.domain.gateway.ISetVideoProcessingGateway;
import com.autoclipper.si.infra.dataprovider.setvideoprocessingdataprovider.SetVideoProcessingMapper;
import com.autoclipper.si.infra.db.model.SetVideoProcessing;
import com.autoclipper.si.infra.db.repositories.interfaces.ISetVideoProcessingRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class SetVideoProcessingDataProvider implements ISetVideoProcessingGateway {

    @Inject
    private ISetVideoProcessingRepository setVideoProcessingRepository;

    @Inject
    private SetVideoProcessingMapper setVideoProcessingMapper;

    @Override
    public ESetVideoProcessingResponse save(ESetVideoProcessingRequest eSetVideoProcessingRequest) {
        SetVideoProcessing setVideoProcessing = setVideoProcessingMapper.eSetVideoProcessingRequestToSetVideoProcessing(eSetVideoProcessingRequest);
        setVideoProcessing = setVideoProcessingRepository.save(setVideoProcessing);
        return setVideoProcessingMapper.setVideoProcessingToESetVideoProcessingResponse(setVideoProcessing);
    }

    @Override
    public List<ESetVideoProcessingResponse> getAll() {
        List<SetVideoProcessing> all = setVideoProcessingRepository.getAll();
        return setVideoProcessingMapper.setVideoProcessingListToESetVideoProcessingResponseList(all);
    }

    @Override
    public void delete(Integer id) {
        setVideoProcessingRepository.delete(id);
    }

    @Override
    public ESetVideoProcessingResponse updateSetVideoProcessing(Integer id, ESetVideoProcessingRequest eSetVideoProcessingRequest) {
        SetVideoProcessing existingSetVideoProcessing = setVideoProcessingRepository.findById(id);

        if (existingSetVideoProcessing == null) {
            // Lançar exceção ou retornar erro adequado, pois o registro não foi encontrado
            // Exemplo: throw new NotFoundException("SetVideoProcessing não encontrado com ID " + id);
        }

        // Atualize os campos relevantes da entidade SetVideoProcessing com base na solicitação (eSetVideoProcessingRequest)
        existingSetVideoProcessing.setProcessId(eSetVideoProcessingRequest.getProcessId());
        existingSetVideoProcessing.setCustomerId(eSetVideoProcessingRequest.getCustomerId());
        existingSetVideoProcessing.setUrl(eSetVideoProcessingRequest.getUrl());
        existingSetVideoProcessing.setStartVideo(eSetVideoProcessingRequest.getStartVideo());
        existingSetVideoProcessing.setEndVideo(eSetVideoProcessingRequest.getEndVideo());
        existingSetVideoProcessing.setAvgClipDuration(eSetVideoProcessingRequest.getAvgClipDuration());
        existingSetVideoProcessing.setStatusReq(eSetVideoProcessingRequest.getStatusReq());

        existingSetVideoProcessing.persistAndFlush();
        return setVideoProcessingMapper.setVideoProcessingToESetVideoProcessingResponse(existingSetVideoProcessing);
    }

    @Override
    public ESetVideoProcessingResponse getSetVideoProcessingById(Integer id) {
        SetVideoProcessing setVideoProcessing = setVideoProcessingRepository.findById(id);

        if (setVideoProcessing == null) {
            // Lançar exceção ou retornar erro adequado, pois o registro não foi encontrado
            // Exemplo: throw new NotFoundException("SetVideoProcessing não encontrado com ID " + id);
        }
        return setVideoProcessingMapper.setVideoProcessingToESetVideoProcessingResponse(setVideoProcessing);
    }
}
