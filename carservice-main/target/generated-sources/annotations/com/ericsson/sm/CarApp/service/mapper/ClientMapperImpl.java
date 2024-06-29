package com.ericsson.sm.CarApp.service.mapper;

import com.ericsson.sm.CarApp.dto.CarResponseDto;
import com.ericsson.sm.CarApp.dto.CarServiceResponseDto;
import com.ericsson.sm.CarApp.dto.ClientRequestDto;
import com.ericsson.sm.CarApp.dto.ClientResponseDto;
import com.ericsson.sm.CarApp.dto.ClientResponseDtowithID;
import com.ericsson.sm.CarApp.model.Car;
import com.ericsson.sm.CarApp.model.CarService;
import com.ericsson.sm.CarApp.model.Client;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-29T20:09:42+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class ClientMapperImpl implements ClientMapper {

    @Override
    public ClientResponseDto toDto(Client client) {
        if ( client == null ) {
            return null;
        }

        ClientResponseDto clientResponseDto = new ClientResponseDto();

        clientResponseDto.setFirstName( client.getFirstName() );
        clientResponseDto.setLastName( client.getLastName() );
        clientResponseDto.setOib( client.getOib() );
        clientResponseDto.setCity( client.getCity() );
        clientResponseDto.setStreet( client.getStreet() );
        clientResponseDto.setStreetNumber( client.getStreetNumber() );
        clientResponseDto.setZipCode( client.getZipCode() );
        clientResponseDto.setCountry( client.getCountry() );
        clientResponseDto.setCars( carListToCarResponseDtoList( client.getCars() ) );

        return clientResponseDto;
    }

    @Override
    public ClientResponseDtowithID toDtowithID(Client client) {
        if ( client == null ) {
            return null;
        }

        ClientResponseDtowithID clientResponseDtowithID = new ClientResponseDtowithID();

        clientResponseDtowithID.setId( client.getId() );
        clientResponseDtowithID.setFirstName( client.getFirstName() );
        clientResponseDtowithID.setLastName( client.getLastName() );
        clientResponseDtowithID.setOib( client.getOib() );
        clientResponseDtowithID.setCity( client.getCity() );
        clientResponseDtowithID.setStreet( client.getStreet() );
        clientResponseDtowithID.setStreetNumber( client.getStreetNumber() );
        clientResponseDtowithID.setZipCode( client.getZipCode() );
        clientResponseDtowithID.setCountry( client.getCountry() );
        clientResponseDtowithID.setCars( carListToCarResponseDtoList( client.getCars() ) );

        return clientResponseDtowithID;
    }

    @Override
    public Client toEntity(ClientRequestDto clientRequestDto) {
        if ( clientRequestDto == null ) {
            return null;
        }

        Client client = new Client();

        client.setFirstName( clientRequestDto.getFirstName() );
        client.setLastName( clientRequestDto.getLastName() );
        client.setOib( clientRequestDto.getOib() );
        client.setCity( clientRequestDto.getCity() );
        client.setStreet( clientRequestDto.getStreet() );
        client.setStreetNumber( clientRequestDto.getStreetNumber() );
        client.setZipCode( clientRequestDto.getZipCode() );
        client.setCountry( clientRequestDto.getCountry() );

        return client;
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

    protected CarResponseDto carToCarResponseDto(Car car) {
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

    protected List<CarResponseDto> carListToCarResponseDtoList(List<Car> list) {
        if ( list == null ) {
            return null;
        }

        List<CarResponseDto> list1 = new ArrayList<CarResponseDto>( list.size() );
        for ( Car car : list ) {
            list1.add( carToCarResponseDto( car ) );
        }

        return list1;
    }
}
