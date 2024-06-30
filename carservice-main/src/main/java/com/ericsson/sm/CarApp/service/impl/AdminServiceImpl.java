package com.ericsson.sm.CarApp.service.impl;

import com.ericsson.sm.CarApp.model.Admin;
import com.ericsson.sm.CarApp.repository.AdminRepository;
import com.ericsson.sm.CarApp.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository;

    @Override
    public boolean authenticate(String username, String password) {
        Admin admin = adminRepository.findByUsername(username);
        return admin != null && admin.getPassword().equals(password);
    }

}
