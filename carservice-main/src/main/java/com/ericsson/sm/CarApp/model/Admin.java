package com.ericsson.sm.CarApp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="admin")
@Getter
@Setter
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admin_sequence")
    @SequenceGenerator(name = "admin_sequence", allocationSize = 1)
    @Column(name = "admin_id")
    private Long id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;
}
