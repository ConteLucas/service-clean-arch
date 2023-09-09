package com.autoclipper.si.app.dto.client.old;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClipperHackerResponseDTO {
    private String videoUrl;
    private String customerId;
    private Integer[] avgTimeMinute;
    private String phoneNumber;
    private String videoStartTime;
    private String videoEndTime;
}
