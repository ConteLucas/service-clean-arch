package com.autoclipper.si.infra.dataprovider.Clip;


import com.autoclipper.si.domain.entities.setclipentities.ESetClipRequest;
import com.autoclipper.si.domain.entities.setclipentities.ESetClipResponse;
import com.autoclipper.si.infra.db.model.SetClip;
import com.autoclipper.si.infra.db.model.SetLeads;
import groovy.util.logging.Log4j2;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
@Log4j2
public class SetClipMapper {

    public SetClip eSetClipToSetClip(ESetClipRequest eSetClipRequest) {
        if (Objects.nonNull(eSetClipRequest)) {
            return SetClip.builder()
                    .processId(eSetClipRequest.getProcessId())
                    .customerId(eSetClipRequest.getCustomerId())
                    .videoId(eSetClipRequest.getVideoId())
                    .videoUrlCreateClip(eSetClipRequest.getVideoUrlCreateClip())
                    .title(eSetClipRequest.getTitle())
                    .thumb(eSetClipRequest.getThumb())
                    .score(eSetClipRequest.getScore())
                    .transcriptClip(eSetClipRequest.getTranscriptClip())
                    .build();
        }
        throw new NullPointerException("NullPointerException set_Clip/SetClipMapper");
    }

    public ESetClipResponse eSetClipToESetClipResponse(SetClip setClip) {
        if (Objects.nonNull(setClip)) {
            return ESetClipResponse.builder()
                    .clipId(setClip.getClipId())
                    .processId(setClip.getProcessId())
                    .customerId(setClip.getCustomerId())
                    .videoId(setClip.getVideoId())
                    .videoUrlCreateClip(setClip.getVideoUrlCreateClip())
                    .title(setClip.getTitle())
                    .thumb(setClip.getThumb())
                    .score(setClip.getScore())
                    .transcriptClip(setClip.getTranscriptClip())
                    .build();
        }
        throw new NullPointerException("NullPointerException set_Clip/SetClipMapper");
    }

    public List<ESetClipResponse> setListToESetListResponseList(List<SetClip> all) {
        return all.stream().map(this::eSetClipToESetClipResponse).collect(Collectors.toList());
    }

    public SetClip updateSetClipFromRequest(SetClip existingSetClip, ESetClipRequest eSetClipRequest){
        existingSetClip.setProcessId(eSetClipRequest.getProcessId());
        existingSetClip.setCustomerId(eSetClipRequest.getCustomerId());
        existingSetClip.setVideoId(eSetClipRequest.getVideoId());
        existingSetClip.setVideoUrlCreateClip(eSetClipRequest.getVideoUrlCreateClip());
        existingSetClip.setTitle(eSetClipRequest.getTitle());
        existingSetClip.setThumb(eSetClipRequest.getThumb());
        existingSetClip.setScore(eSetClipRequest.getScore());
        existingSetClip.setTranscriptClip(eSetClipRequest.getTranscriptClip());
        return existingSetClip;
    }
}
