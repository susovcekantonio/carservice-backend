package com.ericsson.sm.CarApp.service.mapper;

import com.ericsson.sm.CarApp.dto.CarServiceRequestDto;
import com.ericsson.sm.CarApp.dto.CarServiceResponseDto;
import com.ericsson.sm.CarApp.model.CarService;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-31T20:18:28+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class CarServiceMapperImpl implements CarServiceMapper {

    @Override
    public CarService toEntity(CarServiceRequestDto carServiceRequestDto) {
        if ( carServiceRequestDto == null ) {
            return null;
        }

        CarService carService = new CarService();

        carService.setDateOfService( carServiceRequestDto.getDateOfService() );
        carService.setWorkerFirstName( carServiceRequestDto.getWorkerFirstName() );
        carService.setWorkerLastName( carServiceRequestDto.getWorkerLastName() );
        carService.setWorkDescription( carServiceRequestDto.getWorkDescription() );
        carService.setPrice( carServiceRequestDto.getPrice() );
        carService.setPaid( carServiceRequestDto.isPaid() );

        return carService;
    }

    @Override
    public CarServiceResponseDto toDto(CarService carService) {
        if ( carService == null ) {
            return null;
        }

        CarServiceResponseDto carServiceResponseDto = new CarServiceResponseDto();

        carServiceResponseDto.setDateOfService( carService.getDateOfService() );
        carServiceResponseDto.setWorkerFirstName( carService.getWorkerFirstName() );
        carServiceResponseDto.setWorkerLastName( carService.getWorkerLastName() );
        carServiceResponseDto.setWorkDescription( carService.getWorkDescription() );
        carServiceResponseDto.setPrice( carService.getPrice() );
        carServiceResponseDto.setPaid( carService.isPaid() );

        return carServiceResponseDto;
    }
}
