package com.ericsson.sm.CarApp.service.mapper;

import com.ericsson.sm.CarApp.dto.AdminRequestDto;
import com.ericsson.sm.CarApp.model.Admin;
import com.ericsson.sm.CarApp.dto.AdminResponseDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AdminMapper {

    @Mapping(target = "username", source = "username")
    @Mapping(target = "password", source = "password")
    Admin toEntity(AdminRequestDto adminRequestDto);

    @Mapping(target = "username", source = "username")
    @Mapping(target = "password", source = "password")
    AdminResponseDto toDto(Admin admin);
}
