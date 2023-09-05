package com.autoclipper.si.app.dto.setvideoclientdto;

import com.autoclipper.si.infra.db.model.SetCustomer;
import com.autoclipper.si.infra.db.model.SetVideoProcessing;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Generated
@Builder
@AllArgsConstructor
@NoArgsConstructor
@RegisterForReflection
public class SetVideoResponseDto {
    private Integer videoId;
    private SetVideoProcessing processId;
    private SetCustomer customerId;
    private Timestamp videoCreationDate;
    private String transcriptionSrt;
    private String transcriptionTxt;
}
