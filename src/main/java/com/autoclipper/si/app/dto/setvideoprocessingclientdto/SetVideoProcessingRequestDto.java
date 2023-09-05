package com.autoclipper.si.app.dto.setvideoprocessingclientdto;

import com.autoclipper.si.infra.db.model.SetCustomer;
import io.smallrye.common.constraint.NotNull;
import lombok.*;

import java.sql.Timestamp;

@Data
@Generated
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SetVideoProcessingRequestDto {
    @NotNull
    private Integer processId;
    @NotNull
    private SetCustomer customerId;
    private String url;
    @NotNull
    private Timestamp startVideo;
    private Timestamp endVideo;
    private float avgClipDuration;
    private Boolean statusReq;
}
