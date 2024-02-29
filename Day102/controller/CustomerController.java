package com.example.sample.Day102.controller;

import com.example.sample.Day102.model.Customer;
import com.example.sample.Day102.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @GetMapping("/bycity/{city}")
    public List<Customer> getCustomersByCity(@PathVariable String city) {
        return customerService.getCustomersByCity(city);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{customerId}")
    public Optional<Customer> getCustomerById(@PathVariable int customerId) {
        return customerService.getCustomerById(customerId);
    }

    @PutMapping("/{customerId}/{pincode}")
    public Customer updateCustomerPincode(@PathVariable int customerId, @PathVariable int pincode) {
        return customerService.updateCustomerPincode(customerId, pincode);
    }

    @DeleteMapping("/{customerId}")
    public String deleteCustomer(@PathVariable int customerId) {
        return customerService.deleteCustomer(customerId);
    }
}
