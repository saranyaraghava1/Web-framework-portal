package com.example.sample.Day11.controller;


import com.example.sample.Day11.model.Address;
import com.example.sample.Day11.model.Person;
import com.example.sample.Day11.service.AddressService;
import com.example.sample.Day11.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;
    
    @Autowired
    private PersonService personService;

    @PostMapping("/person/{personId}")
    public ResponseEntity<Address> assignAddressToPerson(@PathVariable Long personId, @RequestBody Address address) {
        Address createdAddress = addressService.createAddress(address);
        if (createdAddress == null) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        Person person = personService.getPersonById(personId);
        if (person == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
        person.setAddress(createdAddress);
        personService.updatePerson(personId, person);
        
        return new ResponseEntity<>(createdAddress, HttpStatus.CREATED);
    }
}

