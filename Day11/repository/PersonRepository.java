package com.example.sample.Day11.repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.sample.Day11.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    
    // Query derivation example
    List<Person> findByAddressCity(String city);
    
    // JPQL query example
    @Query("SELECT p FROM Person p WHERE p.address.city = :city")
    List<Person> findByAddressCityJPQL(@Param("city") String city);
    
    // Native SQL query example
    @Query(value = "SELECT * FROM Person p WHERE p.address_id = :addressId", nativeQuery = true)
    List<Person> findByAddressIdNative(@Param("addressId") Long addressId);
}

