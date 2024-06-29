package com.ericsson.sm.CarApp.repository;

import com.ericsson.sm.CarApp.model.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClientRepository extends JpaRepository<Client, Long> {
    @Query("SELECT c FROM Client c WHERE (?1 is null OR c.firstName LIKE %?1%) AND (?2 is null OR c.lastName LIKE %?2%) ORDER BY c.lastName ASC")
    Page<Client> findByFirstOrLastName(
                     String firstname,
                     String lastname,
                     Pageable pageable
    )  ;

}
