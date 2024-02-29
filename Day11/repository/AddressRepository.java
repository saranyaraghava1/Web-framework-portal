package com.example.sample.Day11.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.sample.Day11.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    
    // Query derivation example
    List<Address> findByCity(String city);
    
    // JPQL query example
    @Query("SELECT a FROM Address a WHERE a.city = :city")
    List<Address> findByCityJPQL(@Param("city") String city);
    
    // Native SQL query example
    @Query(value = "SELECT * FROM Address a WHERE a.city = :city", nativeQuery = true)
    List<Address> findByCityNative(@Param("city") String city);
}

