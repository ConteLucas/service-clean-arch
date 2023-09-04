package com.autoclipper.si.domain.entities.message;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RegisterForReflection
public class EClipperHackerMessage {
    private String videoUrl;
    private String customerId;
    private Integer[] avgTimeMinute;
    private String phoneNumber;
    private String videoStartTime;
    private String videoEndTime;
}
