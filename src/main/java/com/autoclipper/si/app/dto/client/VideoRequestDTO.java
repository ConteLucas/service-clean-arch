package com.autoclipper.si.app.dto.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideoRequestDTO {
    private String videoUrl;
    private String customerId;
    private String phoneNumber;
    private String videoStartTime;
    private String videoEndTime;
}
