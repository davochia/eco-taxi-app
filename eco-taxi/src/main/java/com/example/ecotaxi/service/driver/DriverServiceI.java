package com.example.ecotaxi.service.driver;

import com.example.ecotaxi.dtos.DriverDto;

import java.util.List;

public interface DriverServiceI {
    List<DriverDto> getDrivers();
    DriverDto getDriverById(Integer id);
    DriverDto addDriver (DriverDto Driver);
    DriverDto modifyDriver (DriverDto DriverDto, Integer id);
    Boolean deleteDriver (Integer id);
}
