package com.autoclipper.si.domain.entities.message;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RegisterForReflection
public class ETsuruMessage {
    private String message;
    private String phone;
}
