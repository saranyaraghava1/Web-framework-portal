package com.example.sample.Day12ce2.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sample.Day12ce2.model.StudentDetail;
import com.example.sample.Day12ce2.repository.StudentDetailRepository;

@Service
public class StudentDetailService {

    @Autowired
    private StudentDetailRepository studentDetailRepository;

    // Method to save a student detail
    public StudentDetail saveStudentDetail(StudentDetail studentDetail) {
        return studentDetailRepository.save(studentDetail);
    }

    // Other methods can be added here based on requirements

}


