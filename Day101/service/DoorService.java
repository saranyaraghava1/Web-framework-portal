package com.example.sample.Day101.service;

import com.example.sample.Day101.model.Door;
import com.example.sample.Day101.repository.DoorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoorService {

    @Autowired
    private DoorRepo doorRepo;

    public List<Door> getAllDoors() {
        return doorRepo.findAll();
    }

    public List<Door> getDoorsByColor(String color) {
        return doorRepo.findByColor(color);
    }

    public List<Door> getDoorsByDoorType(String doorType) {
        return doorRepo.findByDoorType(doorType);
    }

    public Optional<Door> getDoorById(int doorId) {
        return doorRepo.findById(doorId);
    }

    public Door createDoor(Door door) {
        return doorRepo.save(door);
    }

    public Door updateDoor(int doorId, String color) {
        Optional<Door> optionalDoor = doorRepo.findById(doorId);
        if (optionalDoor.isPresent()) {
            Door door = optionalDoor.get();
            door.setColor(color);
            return doorRepo.save(door);
        }
        return null;
    }

    public String deleteDoor(int doorId) {
        Optional<Door> optionalDoor = doorRepo.findById(doorId);
        if (optionalDoor.isPresent()) {
            doorRepo.deleteById(doorId);
            return "Door deleted successfully.";
        }
        return null;
    }
}
