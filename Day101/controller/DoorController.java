package com.example.sample.Day101.controller;

import com.example.sample.Day101.model.Door;
import com.example.sample.Day101.service.DoorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/door")
public class DoorController {

    @Autowired
    private DoorService doorService;

    @PostMapping
    public Door createDoor(@RequestBody Door door) {
        return doorService.createDoor(door);
    }

    @GetMapping("/bycolor/{color}")
    public List<Door> getDoorsByColor(@PathVariable String color) {
        return doorService.getDoorsByColor(color);
    }

    @PutMapping("/{doorId}")
    public Door updateDoorColor(@PathVariable int doorId, @RequestParam String color) {
        return doorService.updateDoor(doorId, color);
    }

    @DeleteMapping("/{doorId}")
    public String deleteDoor(@PathVariable int doorId) {
        return doorService.deleteDoor(doorId);
    }

    @GetMapping("/bydoortype")
    public List<Door> getDoorsByDoorType(@RequestParam String doorType) {
        return doorService.getDoorsByDoorType(doorType);
    }

    @GetMapping
    public List<Door> getAllDoors() {
        return doorService.getAllDoors();
    }

    @GetMapping("/{doorId}")
    public Optional<Door> getDoorById(@PathVariable int doorId) {
        return doorService.getDoorById(doorId);
    }
}
