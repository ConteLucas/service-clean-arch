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

    @ToString
    public class getMock {
        private String name = "CLIPPERHACKER";
        private String cpfCnpj = "00000000000";
        private String cep = "00000000";
    }

}

