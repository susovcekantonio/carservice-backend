package com.ericsson.sm.CarApp.controller;

import com.ericsson.sm.CarApp.dto.AdminRequestDto;
import com.ericsson.sm.CarApp.dto.AdminResponseDto;
import com.ericsson.sm.CarApp.dto.ClientRequestDto;
import com.ericsson.sm.CarApp.dto.ClientResponseDto;
import com.ericsson.sm.CarApp.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

    @PostMapping("/api/login")
    public String login(@RequestBody AdminRequestDto loginRequest) {
        boolean isAuthenticated = adminService.authenticate(loginRequest.getUsername(), loginRequest.getPassword());
        return isAuthenticated ? "Login successful" : "Login failed";
    }

    @PostMapping("/api/admin")
    public AdminResponseDto save(@RequestBody AdminRequestDto adminRequestDto){
        return adminService.save(adminRequestDto);
    }
}
