package com.example.sample.Day11ce2.service;

import com.example.sample.Day11ce2.model.Student;
import com.example.sample.Day11ce2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public ResponseEntity<Student> updateStudent(Long id, Student studentDetails) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (!studentOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Student student = studentOptional.get();
        student.setName(studentDetails.getName());
        student.setStudentIDCard(studentDetails.getStudentIDCard());
        return new ResponseEntity<>(studentRepository.save(student), HttpStatus.OK);
    }

    public ResponseEntity<String> deleteStudent(Long id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (!studentOptional.isPresent()) {
            return new ResponseEntity<>("Student with ID " + id + " not found", HttpStatus.NOT_FOUND);
        }
        studentRepository.deleteById(id);
        return new ResponseEntity<>("Deleted Student successfully", HttpStatus.OK);
    }
}
