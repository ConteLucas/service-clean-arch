package com.autoclipper.si.domain.entities.setvideoprocessingentities;

import com.autoclipper.si.infra.db.model.SetCustomer;
import com.autoclipper.si.infra.db.model.SetVideoProcessing;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RegisterForReflection
public class ESetVideoProcessingResponse {

    private Integer processId;
    private SetCustomer customerId;
    private String url;
    private Timestamp startVideo;
    private Timestamp endVideo;
    private float avgClipDuration;
    private Boolean statusReq;

}
