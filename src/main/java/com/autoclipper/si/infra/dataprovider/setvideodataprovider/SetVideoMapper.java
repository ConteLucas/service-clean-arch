package com.autoclipper.si.infra.dataprovider.setvideodataprovider;

import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoRequest;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;
import com.autoclipper.si.infra.db.model.SetVideo;
import groovy.util.logging.Log4j2;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
@Log4j2
public class SetVideoMapper {
    public SetVideo eSetVideoRequestToSetVideo(ESetVideoRequest eSetVideoRequest) {
        if (Objects.nonNull(eSetVideoRequest)) {
            return SetVideo.builder()
                    .videoId(eSetVideoRequest.getVideoId())
                    .processId(eSetVideoRequest.getProcessId())
                    .customerId(eSetVideoRequest.getCustomerId())
                    .videoCreationDate(eSetVideoRequest.getVideoCreationDate())
                    .transcriptionSrt(eSetVideoRequest.getTranscriptionSrt())
                    .transcriptionTxt(eSetVideoRequest.getTranscriptionTxt())
                    .customerId(eSetVideoRequest.getCustomerId())
                    .build();
        }
        throw new NullPointerException("NullPointerException set_video/SetVideoMapper");
    }

    public ESetVideoResponse setVideoToESetVideoResponse(SetVideo setVideo) {
        if (Objects.nonNull(setVideo)) {
            return ESetVideoResponse.builder()
                    .videoId(setVideo.getVideoId())
                    .processId(setVideo.getProcessId())
                    .customerId(setVideo.getCustomerId())
                    .videoCreationDate(setVideo.getVideoCreationDate())
                    .transcriptionSrt(setVideo.getTranscriptionSrt())
                    .transcriptionTxt(setVideo.getTranscriptionTxt())
                    .customerId(setVideo.getCustomerId())
                    .build();
        }
        throw new NullPointerException("NullPointerException set_video/SetVideoMapper");
    }
    public SetVideo updateSetVideoFromRequest(SetVideo existingSetVideo, ESetVideoRequest eSetVideoRequest){
        existingSetVideo.setCustomerId(eSetVideoRequest.getCustomerId());
        return existingSetVideo;
    }

    public List<ESetVideoResponse> setVideoListToESetVideoResponseList(List<SetVideo> all) {
        return all.stream().map(this::setVideoToESetVideoResponse).collect(Collectors.toList());
    }
}
