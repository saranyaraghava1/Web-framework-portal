package com.example.sample.Day12ce2.repository;



import com.example.sample.Day12ce2.model.StudentDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDetailRepository extends JpaRepository<StudentDetail, Integer> {
}


