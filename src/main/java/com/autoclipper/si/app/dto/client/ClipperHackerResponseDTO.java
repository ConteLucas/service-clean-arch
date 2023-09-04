package com.autoclipper.si.app.dto.client;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClipperHackerResponseDTO {
    @JsonbProperty("videoUrl")

    private String videoUrl;

    @JsonbProperty("customerId")
    private String customerId;

    @JsonbProperty("avgTimeMinute")
    private Integer[] avgTimeMinute;

    @JsonbProperty("phoneNumber")
    private String phoneNumber;

    @JsonbProperty("videoStartTime")
    private String videoStartTime;

    @JsonbProperty("videoEndTime")
    private String videoEndTime;

}
