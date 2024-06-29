package com.ericsson.sm.CarApp.service.mapper;

import com.ericsson.sm.CarApp.dto.CarRequestDto;
import com.ericsson.sm.CarApp.dto.CarResponseDto;
import com.ericsson.sm.CarApp.dto.CarServiceResponseDto;
import com.ericsson.sm.CarApp.model.Car;
import com.ericsson.sm.CarApp.model.CarService;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-29T13:04:16+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class CarMapperImpl implements CarMapper {

    @Override
    public CarResponseDto toDto(Car car) {
        if ( car == null ) {
            return null;
        }

        CarResponseDto carResponseDto = new CarResponseDto();

        carResponseDto.setCarType( car.getCarType() );
        carResponseDto.setManufactureYear( car.getManufactureYear() );
        carResponseDto.setRegistrationMark( car.getRegistrationMark() );
        carResponseDto.setColor( car.getColor() );
        carResponseDto.setCarServices( carServiceListToCarServiceResponseDtoList( car.getCarServices() ) );

        return carResponseDto;
    }

    @Override
    public Car toEntity(CarRequestDto carRequestDto) {
        if ( carRequestDto == null ) {
            return null;
        }

        Car car = new Car();

        car.setCarType( carRequestDto.getCarType() );
        car.setManufactureYear( carRequestDto.getManufactureYear() );
        car.setRegistrationMark( carRequestDto.getRegistrationMark() );
        car.setColor( carRequestDto.getColor() );

        return car;
    }

    protected CarServiceResponseDto carServiceToCarServiceResponseDto(CarService carService) {
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

    protected List<CarServiceResponseDto> carServiceListToCarServiceResponseDtoList(List<CarService> list) {
        if ( list == null ) {
            return null;
        }

        List<CarServiceResponseDto> list1 = new ArrayList<CarServiceResponseDto>( list.size() );
        for ( CarService carService : list ) {
            list1.add( carServiceToCarServiceResponseDto( carService ) );
        }

        return list1;
    }
}
