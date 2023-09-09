package com.autoclipper.si.infra.dataprovider.setvideodataprovider;

import com.autoclipper.si.app.service.cross.InternalRuntimeException;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoRequest;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;
import com.autoclipper.si.domain.gateway.ISetVideoGateway;
import com.autoclipper.si.infra.db.model.SetVideo;
import com.autoclipper.si.infra.db.repositories.interfaces.ISetVideoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class SetVideoDataProvider implements ISetVideoGateway {

    @Inject
    private ISetVideoRepository setVideoRepository;

    @Inject
    private SetVideoMapper setVideoMapper;

    @Override
    public ESetVideoResponse save(ESetVideoRequest eSetVideoRequest) {
        SetVideo setVideo = setVideoMapper.eSetVideoRequestToSetVideo(eSetVideoRequest);
        setVideo = setVideoRepository.save(setVideo);
        return setVideoMapper.setVideoToESetVideoResponse(setVideo);
    }

    @Override
    public List<ESetVideoResponse> getAll() {
        List<SetVideo> all = setVideoRepository.getAll();
        return setVideoMapper.setVideoListToESetVideoResponseList(all);
    }

    @Override
    public void delete(Integer id) {
        setVideoRepository.delete(id);
    }

    @Override
    public ESetVideoResponse updateSetVideo(Integer id, ESetVideoRequest eSetVideoRequest) {
        SetVideo existingSetVideo = setVideoRepository.findById(id);

        if (existingSetVideo == null) {
            throw new InternalRuntimeException("SetVideo não encontrado com ID " + id);
        }
        existingSetVideo.setProcessId(eSetVideoRequest.getProcessId());
        existingSetVideo = setVideoMapper.updateSetVideoFromRequest(existingSetVideo, eSetVideoRequest);
        existingSetVideo.persistAndFlush();
        return setVideoMapper.setVideoToESetVideoResponse(existingSetVideo);
    }

    @Override
    public ESetVideoResponse getSetVideoById(Integer id) {
        SetVideo setVideo = setVideoRepository.findById(id);

        if (setVideo == null) {
            throw new InternalRuntimeException("SetVideo não encontrado com ID " + id);
        }
        return setVideoMapper.setVideoToESetVideoResponse(setVideo);
    }
}
