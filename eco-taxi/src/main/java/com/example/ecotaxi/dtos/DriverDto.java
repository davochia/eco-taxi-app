package com.example.ecotaxi.dtos;

import com.example.ecotaxi.model.Driver;
import lombok.Data;

import java.util.Date;

@Data
public class DriverDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    private Date dateOfBirth;

    public static Driver getDriver(DriverDto DriverDto){
        Driver Driver  = new Driver();

        Driver.setId(DriverDto.getId());
        Driver.setFirstName(DriverDto.getFirstName());
        Driver.setLastName(DriverDto.getLastName());
        Driver.setPhone(DriverDto.getPhone());
        Driver.setEmail(DriverDto.getEmail());
        Driver.setAddress(DriverDto.getAddress());
        Driver.setDateOfBirth(DriverDto.getDateOfBirth());

        return Driver;
    }

    public static DriverDto getDriverDto(Driver Driver){
        DriverDto DriverDto  = new DriverDto();

        DriverDto.setId(Driver.getId());
        DriverDto.setFirstName(Driver.getFirstName());
        DriverDto.setLastName(Driver.getLastName());
        DriverDto.setPhone(Driver.getPhone());
        DriverDto.setEmail(Driver.getEmail());
        DriverDto.setAddress(Driver.getAddress());
        DriverDto.setDateOfBirth(Driver.getDateOfBirth());

        return DriverDto;
    }
}