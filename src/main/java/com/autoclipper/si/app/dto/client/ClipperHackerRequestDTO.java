package com.autoclipper.si.app.dto.client;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClipperHackerRequestDTO {
    @JsonbProperty("phone")
    private String phone;
    @JsonbProperty("message")
    private String message;
}

