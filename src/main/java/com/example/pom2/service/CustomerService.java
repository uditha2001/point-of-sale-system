package com.example.pom2.service;


import com.example.pom2.dto.CustomerDTO;
import com.example.pom2.dto.request.CustomerUpdateDTO;

import java.util.List;


public interface CustomerService {
    public String updateCustomer(CustomerUpdateDTO updateDTO) ;


    String saveCustomer(CustomerDTO customerDTO);

    public CustomerDTO search(int customerID);

   public List<CustomerDTO> getAllCustomers();

    String deleteCustomer(int id);
}


