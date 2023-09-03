package com.autoclipper.si.app.dto;

import com.autoclipper.si.infra.db.model.SetCustomer;
import io.smallrye.common.constraint.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
