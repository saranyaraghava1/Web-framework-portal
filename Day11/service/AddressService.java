package com.example.sample.Day11.service;


import com.example.sample.Day11.model.Address;
import com.example.sample.Day11.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address updateAddress(Long id, Address addressDetails) {
        Address address = addressRepository.findById(id).orElse(null);
        if (address == null) {
            return null; // or throw exception, handle according to your requirement
        }

        address.setStreet(addressDetails.getStreet());
        address.setCity(addressDetails.getCity());
        address.setZipCode(addressDetails.getZipCode());

        return addressRepository.save(address);
    }

    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }
}

