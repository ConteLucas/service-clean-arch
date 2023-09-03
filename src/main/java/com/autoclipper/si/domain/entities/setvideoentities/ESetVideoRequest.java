package com.autoclipper.si.domain.entities.setvideoentities;

import com.autoclipper.si.infra.db.model.SetCustomer;
import com.autoclipper.si.infra.db.model.SetVideoProcessing;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

import javax.persistence.Column;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RegisterForReflection
public class ESetVideoRequest {

    private Integer videoId;
    private SetVideoProcessing processId;
    private SetCustomer customerId;
    private Timestamp videoCreationDate;
    private String transcriptionSrt;
    private String transcriptionTxt;
}
