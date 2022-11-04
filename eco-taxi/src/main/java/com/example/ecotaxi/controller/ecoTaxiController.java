package com.example.ecotaxi.controller;

import com.example.ecotaxi.dtos.CustomerDto;
import com.example.ecotaxi.dtos.DriverDto;
import com.example.ecotaxi.exception.CustomerNotFoundException;
import com.example.ecotaxi.exception.DriverNotFoundException;
import com.example.ecotaxi.service.customer.CustomerServiceImpl;
import com.example.ecotaxi.service.driver.DriverServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("api/eco-taxi")
public class ecoTaxiController {

    @Autowired
    private CustomerServiceImpl customerServiceImpl;

    @Autowired
    private DriverServiceImpl driverService;

    /**
     * 
     * Driver
     */

    @PostMapping
    @Operation(summary="Add a new customer to system")
    public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customerDto) {
        return new ResponseEntity<>(customerServiceImpl.addCustomer(customerDto), HttpStatus.CREATED);
    }

    @GetMapping
    @Operation(summary="Get all Customers from system")
    public ResponseEntity<List<CustomerDto>> getAllCustomers() {
        return new ResponseEntity<>(customerServiceImpl.getCustomers(), HttpStatus.OK);
    }


    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Customer Found", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CustomerDto.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied", content = @Content),
            @ApiResponse(responseCode = "404", description = "Customer not found", content = @Content) })
    @Operation(summary = "Get Customer from system find by id")
    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> getCustomerById(
            @Parameter(description = "id of Customer to be searched") @PathVariable Integer id) {
        return new ResponseEntity<>(customerServiceImpl.getCustomerById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary="Edit customer in the system")
    public ResponseEntity<CustomerDto> editCustomer(@PathVariable Integer id, @RequestBody CustomerDto newCustomer) {
        return new ResponseEntity<>(customerServiceImpl.modifyCustomer(newCustomer, id), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    @Operation(summary="Delete Customer from system")
    public ResponseEntity<String> deleteCustomer(@PathVariable Integer id) throws CustomerNotFoundException {
        customerServiceImpl.deleteCustomer(id);
        return new ResponseEntity<>("Customer with ID: " + id + " deleted", HttpStatus.NO_CONTENT);
    }


    /**
     * Driver 
     */
    @PostMapping
    @Operation(summary="Add a new Driver to system")
    public ResponseEntity<DriverDto> createDriver(@RequestBody DriverDto DriverDto) {
        return new ResponseEntity<>(driverService.addDriver(DriverDto), HttpStatus.CREATED);
    }

    @GetMapping
    @Operation(summary="Get all Drivers from system")
    public ResponseEntity<List<DriverDto>> getAllDrivers() {
        return new ResponseEntity<>(driverService.getDrivers(), HttpStatus.OK);
    }


    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Driver Found", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = DriverDto.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied", content = @Content),
            @ApiResponse(responseCode = "404", description = "Driver not found", content = @Content) })
    @Operation(summary = "Get Driver from system find by id")
    @GetMapping("/{id}")
    public ResponseEntity<DriverDto> getDriverById(
            @Parameter(description = "id of Driver to be searched") @PathVariable Integer id) {
        return new ResponseEntity<>(driverService.getDriverById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary="Edit Driver in the system")
    public ResponseEntity<DriverDto> editDriver(@PathVariable Integer id, @RequestBody DriverDto newDriver) {
        return new ResponseEntity<>(driverService.modifyDriver(newDriver, id), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    @Operation(summary="Delete Driver from system")
    public ResponseEntity<String> deleteDriver(@PathVariable Integer id) throws DriverNotFoundException {
        driverService.deleteDriver(id);
        return new ResponseEntity<>("Driver with ID: " + id + " deleted", HttpStatus.NO_CONTENT);
    }

}
