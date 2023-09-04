package com.autoclipper.si.app.dto.client;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClipperHackerRequestDTO {
    @JsonbProperty("phone")
    private String customerPhone;
    @JsonbProperty("video_url")
    private String videoUrlCreateClip;


}
