package com.example.ecotaxi.service.customer;

import com.example.ecotaxi.dtos.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerServiceI {


    /**
     * @return
     */
    @Override
    public List<CustomerDto> getCustomers() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public CustomerDto getCustomerById(Integer id) {
        return null;
    }

    /**
     * @param customer
     * @return
     */
    @Override
    public CustomerDto addCustomer(CustomerDto customer) {
        return null;
    }

    /**
     * @param customerDto
     * @param id
     * @return
     */
    @Override
    public CustomerDto modifyCustomer(CustomerDto customerDto, Integer id) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Boolean deleteCustomer(Integer id) {
        return null;
    }
}
