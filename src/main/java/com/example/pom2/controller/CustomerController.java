package com.example.pom2.controller;

import com.example.pom2.dto.CustomerDTO;
import com.example.pom2.dto.request.CustomerUpdateDTO;
import com.example.pom2.service.Impl.CustomerServiceIMPL;
import com.example.pom2.utill.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    CustomerServiceIMPL customerService;

    @PostMapping("/save1")
    public ResponseEntity<StandardResponse> saveCustomer(@RequestBody CustomerDTO customerDTO) {
        String message = customerDTO.getCustomerName();
        customerService.saveCustomer(customerDTO);
        return new ResponseEntity<>(
                new StandardResponse("success", 201, message), HttpStatus.CREATED
        );
    }

    @PutMapping("/update")
    public ResponseEntity<StandardResponse> updateCustomer(@RequestBody CustomerUpdateDTO updateDTO) {
        String message = customerService.updateCustomer(updateDTO);
        return new ResponseEntity<>(
                new StandardResponse("success", 202, message), HttpStatus.OK
        );
    }

    @GetMapping(path = "/get-by-id", params = "id")
    public CustomerDTO getCustomer(int id) {
        CustomerDTO foundedCustomer = customerService.search(id);
        return foundedCustomer;
    }

    @GetMapping(path = "/getall")
    public List<CustomerDTO> getAllCustomer() {
        List<CustomerDTO> customers = customerService.getAllCustomers();
        return customers;
    }

    @DeleteMapping(path = "/delete-customer", params = "id")
    public String deleteCustomer(@RequestParam int id) {
        String deleted = customerService.deleteCustomer(id);
        return deleted;

    }

}
