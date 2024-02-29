package com.example.sample.Day11ce2.repository;



import com.example.sample.Day11ce2.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s WHERE s.id = ?1")
    Student findStudentById(Long id);
}

