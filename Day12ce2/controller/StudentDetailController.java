package com.example.sample.Day12ce2.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.sample.Day12ce2.model.StudentDetail;
import com.example.sample.Day12ce2.service.StudentDetailService;

@RestController
public class StudentDetailController {

    @Autowired
    private StudentDetailService studentDetailService;

    @PostMapping("/studentDetail/student/{id}")
    public ResponseEntity<StudentDetail> assignStudentDetailToStudent(@PathVariable int id, @RequestBody StudentDetail studentDetail) {
        // Implement your logic for assigning student detail to student
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}


