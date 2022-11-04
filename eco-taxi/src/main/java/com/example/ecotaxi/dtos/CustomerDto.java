package com.example.ecotaxi.dtos;

import com.example.ecotaxi.model.Customer;
import lombok.Data;

import java.util.Date;

@Data
public class CustomerDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    private Date dateOfBirth;

    public static Customer getCustomer(CustomerDto CustomerDto){
        Customer customer  = new Customer();

        customer.setId(CustomerDto.getId());
        customer.setFirstName(CustomerDto.getFirstName());
        customer.setLastName(CustomerDto.getLastName());
        customer.setPhone(CustomerDto.getPhone());
        customer.setEmail(CustomerDto.getEmail());
        customer.setAddress(CustomerDto.getAddress());
        customer.setDateOfBirth(CustomerDto.getDateOfBirth());

        return customer;
    }

    public static CustomerDto getCustomerDto(Customer customer){
        CustomerDto customerDto  = new CustomerDto();

        customerDto.setId(customer.getId());
        customerDto.setFirstName(customer.getFirstName());
        customerDto.setLastName(customer.getLastName());
        customerDto.setPhone(customer.getPhone());
        customerDto.setEmail(customer.getEmail());
        customerDto.setAddress(customer.getAddress());
        customerDto.setDateOfBirth(customer.getDateOfBirth());

        return customerDto;
    }
}
