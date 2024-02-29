package com.example.sample.Day102.service;

import com.example.sample.Day102.model.Customer;
import com.example.sample.Day102.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    public List<Customer> getCustomersByCity(String city) {
        return customerRepo.findByCity(city);
    }

    public Optional<Customer> getCustomerById(int customerId) {
        return customerRepo.findById(customerId);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public Customer updateCustomerPincode(int customerId, int pincode) {
        Optional<Customer> optionalCustomer = customerRepo.findById(customerId);
        if (optionalCustomer.isPresent()) {
            Customer customer = optionalCustomer.get();
            customer.setPincode(pincode);
            return customerRepo.save(customer);
        }
        return null;
    }

    public String deleteCustomer(int customerId) {
        Optional<Customer> optionalCustomer = customerRepo.findById(customerId);
        if (optionalCustomer.isPresent()) {
            customerRepo.deleteById(customerId);
            return "Customer deleted successfully.";
        }
        return null;
    }
}
