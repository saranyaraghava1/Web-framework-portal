package com.example.sample.Day101.repository;

import com.example.sample.Day101.model.Door;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoorRepo extends JpaRepository<Door, Integer> {

    List<Door> findByColor(String color);

    @Query("SELECT d FROM Door d WHERE d.doorType = ?1")
    List<Door> findByDoorType(String doorType);
}
