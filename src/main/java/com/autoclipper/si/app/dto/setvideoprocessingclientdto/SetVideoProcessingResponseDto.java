package com.autoclipper.si.app.dto.setvideoprocessingclientdto;

import com.autoclipper.si.infra.db.model.SetCustomer;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

import java.sql.Timestamp;

@Data
@Generated
@Builder
@AllArgsConstructor
@NoArgsConstructor
@RegisterForReflection
public class SetVideoProcessingResponseDto {
    private Integer processId;
    private SetCustomer customerId;
    private String url;
    private Timestamp startVideo;
    private Timestamp endVideo;
    private float avgClipDuration;
    private Boolean statusReq;
}
