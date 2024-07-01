package com.ericsson.sm.CarApp.service;

import com.ericsson.sm.CarApp.dto.AdminRequestDto;
import com.ericsson.sm.CarApp.dto.AdminResponseDto;

public interface AdminService {
    boolean authenticate(String username, String password);

    AdminResponseDto save(AdminRequestDto adminRequestDto);
}
