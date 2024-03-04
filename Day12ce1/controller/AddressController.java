package com.example.sample.Day12ce1.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.sample.Day12ce1.model.Address;
import com.example.sample.Day12ce1.service.AddressService;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    // Endpoint to create an address
    @PostMapping("/address")
    public ResponseEntity<Address> createAddress(@RequestBody Address address) {
        Address createdAddress = addressService.saveAddress(address);
        if (createdAddress != null) {
            return new ResponseEntity<>(createdAddress, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Endpoint to delete an address by ID
    @DeleteMapping("/address/{id}")
    public ResponseEntity<Void> deleteAddress(@PathVariable int id) {
        addressService.deleteAddress(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Endpoint to get an address by ID
    @GetMapping("/address/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable int id) {
        Address address = addressService.getAddressById(id);
        if (address != null) {
            return new ResponseEntity<>(address, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint to update an address
    @PutMapping("/address/{id}")
    public ResponseEntity<Address> updateAddress(@PathVariable int id, @RequestBody Address updatedAddress) {
        Address address = addressService.updateAddress(id, updatedAddress);
        if (address != null) {
            return new ResponseEntity<>(address, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}


