package com.autoclipper.si.app.dto;

import com.autoclipper.si.infra.db.model.SetCustomer;
import com.autoclipper.si.infra.db.model.SetVideo;
import com.autoclipper.si.infra.db.model.SetVideoProcessing;
import io.quarkus.runtime.annotations.RegisterForReflection;
import io.smallrye.common.constraint.NotNull;
import lombok.*;

@Data
@Generated
@Builder
@AllArgsConstructor
@NoArgsConstructor
@RegisterForReflection
public class SetClipResponseDto {
    private Integer clipId;
    private SetVideoProcessing processId;
    private SetCustomer customerId;
    private SetVideo videoId;
    private String videoUrlCreateClip;
    private String title;
    private String thumb;
    private Integer score;
    private String transcriptClip;
}
