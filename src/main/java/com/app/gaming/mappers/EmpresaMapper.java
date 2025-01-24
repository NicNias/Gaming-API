package com.app.gaming.mappers;

import com.app.gaming.dto.EmpresaDto;
import com.app.gaming.entity.EmpresaEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmpresaMapper {
    EmpresaEntity toModel(EmpresaDto empresaDto);
    EmpresaDto toDto(EmpresaEntity empresaEntity);

    List<EmpresaDto> ListEmpresaDto(List<EmpresaEntity> empresas);
}
