package com.autoclipper.si.app.dto.setclipclientdto;

import com.autoclipper.si.infra.db.model.SetCustomer;
import com.autoclipper.si.infra.db.model.SetVideo;
import com.autoclipper.si.infra.db.model.SetVideoProcessing;
import io.smallrye.common.constraint.NotNull;
import lombok.*;

@Data
@Generated
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SetClipRequestDto {
    @NotNull
    private Integer clipId;
    @NotNull
    private SetVideoProcessing processId;
    @NotNull
    private SetCustomer customerId;
    @NotNull
    private SetVideo videoId;
    private String videoUrlCreateClip;
    @NotNull
    private String title;
    private String thumb;
    private Integer score;
    @NotNull
    private String transcriptClip;


}
