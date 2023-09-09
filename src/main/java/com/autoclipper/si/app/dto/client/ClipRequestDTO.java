package com.autoclipper.si.app.dto.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClipRequestDTO {
    private String videoUrl;
    private String customerId;
    private Integer[] avgTimeMinute;
    private String phoneNumber;
    private String videoStartTime;
    private String videoEndTime;
}
