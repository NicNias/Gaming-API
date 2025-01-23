package com.app.gaming.dto;

import com.app.gaming.entity.EmpresaEntity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record GameDto(
        @NotNull @NotBlank String name,
        @NotNull @NotBlank EmpresaEntity empresaEntity,
        @NotNull @NotBlank String category,
        @NotNull @NotBlank String price,
        @NotNull @NotBlank String description
        ) {
}
