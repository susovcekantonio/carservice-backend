package com.ericsson.sm.CarApp.service.impl;

import com.ericsson.sm.CarApp.dto.AdminRequestDto;
import com.ericsson.sm.CarApp.dto.AdminResponseDto;
import com.ericsson.sm.CarApp.model.Admin;
import com.ericsson.sm.CarApp.repository.AdminRepository;
import com.ericsson.sm.CarApp.service.AdminService;
import com.ericsson.sm.CarApp.service.mapper.AdminMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository;
    private final AdminMapper adminMapper;

    @Override
    public boolean authenticate(String username, String password) {
        Admin admin = adminRepository.findByUsername(username);
        return admin != null && admin.getPassword().equals(password);
    }

    public AdminResponseDto save(AdminRequestDto adminRequestDto) {
        Admin admin = adminMapper.toEntity(adminRequestDto);

        Admin savedAdmin = adminRepository.save(admin);

        AdminResponseDto adminResponseDto = adminMapper.toDto(savedAdmin);

        return adminResponseDto;
    }


}
