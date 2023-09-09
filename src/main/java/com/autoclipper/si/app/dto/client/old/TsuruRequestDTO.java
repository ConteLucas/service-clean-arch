package com.autoclipper.si.app.dto.client.old;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TsuruRequestDTO {
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
