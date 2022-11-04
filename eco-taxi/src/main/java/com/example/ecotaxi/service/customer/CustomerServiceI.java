package com.example.ecotaxi.service.customer;

import com.example.ecotaxi.dtos.CustomerDto;

import java.util.List;

public interface CustomerServiceI {

    List<CustomerDto> getCustomers();
    CustomerDto getCustomerById(Integer id);
    CustomerDto addCustomer (CustomerDto customer);
    CustomerDto modifyCustomer (CustomerDto customerDto, Integer id);
    Boolean deleteCustomer (Integer id);

}
