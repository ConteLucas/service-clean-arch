package com.autoclipper.si.infra.dataprovider.setvideoprocessingdataprovider;

import com.autoclipper.si.app.dto.setvideoprocessingclientdto.SetVideoProcessingRequestDto;
import com.autoclipper.si.app.service.cross.InternalRuntimeException;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingRequest;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;
import com.autoclipper.si.domain.gateway.ISetVideoProcessingGateway;
import com.autoclipper.si.infra.db.model.SetVideoProcessing;
import com.autoclipper.si.infra.db.repositories.interfaces.ISetVideoProcessingRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.NotFoundException;

import java.util.List;

@ApplicationScoped
public class SetVideoProcessingDataProvider implements ISetVideoProcessingGateway {

    @Inject
    private ISetVideoProcessingRepository iSetVideoProcessingRepository;

    @Inject
    private SetVideoProcessingMapper setVideoProcessingMapper;

    @Override
    public ESetVideoProcessingResponse save(ESetVideoProcessingRequest eSetVideoProcessingRequest) {
        SetVideoProcessing setVideoProcessing = setVideoProcessingMapper.eSetVideoProcessingRequestToSetVideoProcessing(eSetVideoProcessingRequest);
        setVideoProcessing = iSetVideoProcessingRepository.save(setVideoProcessing);
        return setVideoProcessingMapper.setVideoProcessingToESetVideoProcessingResponse(setVideoProcessing);
    }

    @Override
    public List<ESetVideoProcessingResponse> getAll() {
        List<SetVideoProcessing> all = iSetVideoProcessingRepository.getAll();
        return setVideoProcessingMapper.setVideoProcessingListToESetVideoProcessingResponseList(all);
    }

    @Override
    public ESetVideoProcessingResponse updateSetVideoProcessing(Integer id, ESetVideoProcessingRequest eSetVideoProcessingRequest) {
        SetVideoProcessing existingSetVideoProcessing = iSetVideoProcessingRepository.findById(id);

        if (existingSetVideoProcessing == null) {
            throw new InternalRuntimeException("SetVideoProcessing não encontrado com ID " + id);
        }

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
        SetVideoProcessing setVideoProcessing = iSetVideoProcessingRepository.findById(id);
        if (setVideoProcessing != null) {
            return setVideoProcessingMapper.setVideoProcessingToESetVideoProcessingResponse(setVideoProcessing);
        }
        throw new NotFoundException("SetLeads não encontrado com ID " + id);
    }

    @Override
    public void delete(Integer id) {
        iSetVideoProcessingRepository.delete(id);
    }

}
