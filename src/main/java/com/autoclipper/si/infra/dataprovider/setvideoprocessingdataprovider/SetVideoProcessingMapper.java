package com.autoclipper.si.infra.dataprovider.setvideoprocessingdataprovider;

import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingRequest;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;
import com.autoclipper.si.infra.db.model.SetVideoProcessing;
import groovy.util.logging.Log4j2;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
@Log4j2
public class SetVideoProcessingMapper {
    public SetVideoProcessing eSetVideoProcessingRequestToSetVideoProcessing(ESetVideoProcessingRequest eSetVideoProcessingRequest) {
        if (Objects.nonNull(eSetVideoProcessingRequest)) {
            return SetVideoProcessing.builder()
                    .processId(eSetVideoProcessingRequest.getProcessId())
                    .customerId(eSetVideoProcessingRequest.getCustomerId())
                    .url(eSetVideoProcessingRequest.getUrl())
                    .startVideo(eSetVideoProcessingRequest.getStartVideo())
                    .endVideo(eSetVideoProcessingRequest.getEndVideo())
                    .avgClipDuration(eSetVideoProcessingRequest.getAvgClipDuration())
                    .statusReq(eSetVideoProcessingRequest.getStatusReq())
                    .build();
        }
        throw new NullPointerException("NullPointerException set_video_processing/SetVideoProcessingMapper");
    }

    public ESetVideoProcessingResponse setVideoProcessingToESetVideoProcessingResponse(SetVideoProcessing setVideoProcessing) {
        if (Objects.nonNull(setVideoProcessing)) {
            return ESetVideoProcessingResponse.builder()
                    .processId(setVideoProcessing.getProcessId())
                    .customerId(setVideoProcessing.getCustomerId())
                    .url(setVideoProcessing.getUrl())
                    .startVideo(setVideoProcessing.getStartVideo())
                    .endVideo(setVideoProcessing.getEndVideo())
                    .avgClipDuration(setVideoProcessing.getAvgClipDuration())
                    .statusReq(setVideoProcessing.getStatusReq())
                    .build();
        }
        throw new NullPointerException("NullPointerException set_video_processing/SetVideoProcessingMapper");
    }

    // Se necessário, adicione métodos para mapear e atualizar campos específicos
    // entre a entidade SetVideoProcessing e a solicitação ESetVideoProcessingRequest.

    public SetVideoProcessing updateSetVideoProcessingFromRequest(SetVideoProcessing existingSetVideoProcessing, ESetVideoProcessingRequest eSetVideoProcessingRequest) {
        existingSetVideoProcessing.setCustomerId(eSetVideoProcessingRequest.getCustomerId());
        // Atualize outros campos, se necessário
        return existingSetVideoProcessing;
    }

    public List<ESetVideoProcessingResponse> setVideoProcessingListToESetVideoProcessingResponseList(List<SetVideoProcessing> all) {
        return all.stream().map(this::setVideoProcessingToESetVideoProcessingResponse).collect(Collectors.toList());
    }
}
