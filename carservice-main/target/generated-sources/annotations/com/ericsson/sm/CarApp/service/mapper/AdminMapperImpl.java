package com.ericsson.sm.CarApp.service.mapper;

import com.ericsson.sm.CarApp.dto.AdminRequestDto;
import com.ericsson.sm.CarApp.dto.AdminResponseDto;
import com.ericsson.sm.CarApp.model.Admin;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-31T20:18:28+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class AdminMapperImpl implements AdminMapper {

    @Override
    public Admin toEntity(AdminRequestDto adminRequestDto) {
        if ( adminRequestDto == null ) {
            return null;
        }

        Admin admin = new Admin();

        admin.setUsername( adminRequestDto.getUsername() );
        admin.setPassword( adminRequestDto.getPassword() );

        return admin;
    }

    @Override
    public AdminResponseDto toDto(Admin admin) {
        if ( admin == null ) {
            return null;
        }

        AdminResponseDto adminResponseDto = new AdminResponseDto();

        adminResponseDto.setUsername( admin.getUsername() );
        adminResponseDto.setPassword( admin.getPassword() );

        return adminResponseDto;
    }
}
