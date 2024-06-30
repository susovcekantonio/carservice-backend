package com.ericsson.sm.CarApp.repository;

import com.ericsson.sm.CarApp.model.Admin;
import com.ericsson.sm.CarApp.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
    Admin findByUsername(String username);
}
