package com.example.pom2.service.Impl;


import com.example.pom2.dto.CustomerDTO;
import com.example.pom2.dto.request.CustomerUpdateDTO;
import com.example.pom2.entity.Customer;
import com.example.pom2.repo.CustomerRepo;
import com.example.pom2.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceIMPL implements CustomerService {
    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public String updateCustomer(CustomerUpdateDTO updateDTO) {
        if(customerRepo.existsById(updateDTO.getCustomerId())){
                Customer customer=customerRepo.getReferenceById(updateDTO.getCustomerId());
                customer.setCustomerName(updateDTO.getCustomerName());
                customer.setCustomerAddress(updateDTO.getCustomerAddress());
                customer.setCustomerSalary(updateDTO.getCustomerSalary());

                customerRepo.save(customer);
        }
        else{
            throw new RuntimeException("id is not found");
        }
        return updateDTO.getCustomerName()+" updated successfull";
    }


    public String saveCustomer(CustomerDTO customerDTO){
        Customer customer=modelMapper.map(customerDTO,Customer.class);
        customerRepo.save(customer);
        return customerDTO.getCustomerName();
    }

    @Override
    public CustomerDTO search(int CustomerId) {
        if(customerRepo.existsById(CustomerId)) {
            Customer customer = customerRepo.getReferenceById(CustomerId);
            CustomerDTO customerDTO=new CustomerDTO(
                    customer.getCustomerId(),customer.getCustomerName(),customer.getCustomerAddress(),customer.getNic(),customer.isActive(),customer.getCustomerSalary()
            );
              return customerDTO;
        }
        else{
            throw new RuntimeException("customer not found");
        }

    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> customers=customerRepo.findAll();
        List<CustomerDTO> customerDTOs=modelMapper.map(customers,new TypeToken<List<CustomerDTO>>(){}.getType());

        return customerDTOs;
    }

    @Override
    public String deleteCustomer(int id) {
            if(customerRepo.existsById(id)){
                customerRepo.deleteById(id);
                return "id "+id+" is successfully deleted";
            }
            else{
                throw new RuntimeException("no customer found");
            }
    }

}
