package com.autoclipper.si.domain.entities.setclipentities;

import com.autoclipper.si.infra.db.model.SetCustomer;
import com.autoclipper.si.infra.db.model.SetVideo;
import com.autoclipper.si.infra.db.model.SetVideoProcessing;
import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RegisterForReflection
public class ESetClipResponse {
    private Integer userId;
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
