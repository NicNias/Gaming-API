package com.app.gaming.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AuthenticationRequestDto(
        @NotNull @NotBlank String email,
        @NotNull @NotBlank String password
) {
}
