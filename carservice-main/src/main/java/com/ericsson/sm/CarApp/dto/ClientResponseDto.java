package com.ericsson.sm.CarApp.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class ClientResponseDto {

    private String firstName;
    private String lastName;
    private String oib;
    private String city;
    private String street;
    private String streetNumber;
    private String zipCode;
    private String country;
    private List<CarResponseDto> cars;
}
