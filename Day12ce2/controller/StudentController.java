package com.example.sample.Day12ce2.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.sample.Day12ce2.model.Student;
import com.example.sample.Day12ce2.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        // Implement your logic for creating a student
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/students-inner-join")
    public ResponseEntity<List<Student>> getStudentsInnerJoin() {
        List<Student> students = studentService.getStudentsInnerJoin();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/students-left-outer-join")
    public ResponseEntity<List<Student>> getStudentsLeftOuterJoin() {
        List<Student> students = studentService.getStudentsLeftOuterJoin();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
}


