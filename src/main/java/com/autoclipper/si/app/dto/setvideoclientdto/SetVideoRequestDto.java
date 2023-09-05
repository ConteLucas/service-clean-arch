package com.autoclipper.si.app.dto.setvideoclientdto;

import com.autoclipper.si.infra.db.model.SetCustomer;
import com.autoclipper.si.infra.db.model.SetVideoProcessing;
import io.smallrye.common.constraint.NotNull;
import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Generated
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SetVideoRequestDto {

    @NotNull
    private Integer videoId;
    @NotNull
    private SetVideoProcessing processId;
    @NotNull
    private SetCustomer customerId;
    @NotNull
    private Timestamp videoCreationDate;
    @NotNull
    private String transcriptionSrt;
    @NotNull
    private String transcriptionTxt;
}
