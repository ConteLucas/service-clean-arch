package com.autoclipper.si.app.dto.client.old;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TsuruResponseDTO {
    private String phone;
    private String message;
}
