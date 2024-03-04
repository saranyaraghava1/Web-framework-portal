package com.example.sample.Day12ce1.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sample.Day12ce1.model.Address;
import com.example.sample.Day12ce1.repository.AddressRepository;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    // Method to save an address
    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    // Method to delete an address by ID
    public void deleteAddress(int id) {
        addressRepository.deleteById(id);
    }

    // Method to get an address by ID
    public Address getAddressById(int id) {
        return addressRepository.findById(id).orElse(null);
    }

    // Method to update an address
    public Address updateAddress(int id, Address updatedAddress) {
        Address existingAddress = addressRepository.findById(id).orElse(null);
        if (existingAddress != null) {
            // Update the existing address with the new details
            existingAddress.setCity(updatedAddress.getCity());
            existingAddress.setStreet(updatedAddress.getStreet());
            // Save the updated address
            return addressRepository.save(existingAddress);
        }
        return null; // Return null if the address with the given ID doesn't exist
    }

    // You can add more methods here according to your requirements
}


