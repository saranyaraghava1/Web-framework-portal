package com.example.sample.Day102.repository;

import com.example.sample.Day102.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    List<Customer> findByCity(String city);
}
