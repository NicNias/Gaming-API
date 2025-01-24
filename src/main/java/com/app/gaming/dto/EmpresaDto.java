package com.app.gaming.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EmpresaDto(
        @NotNull @NotBlank String name,
        @NotNull @NotBlank String email,
        @NotNull @NotBlank String password
) {
}
