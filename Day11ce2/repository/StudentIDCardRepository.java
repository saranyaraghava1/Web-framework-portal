package com.example.sample.Day11ce2.repository;


import com.example.sample.Day11ce2.model.StudentIDCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentIDCardRepository extends JpaRepository<StudentIDCard, Long> {

    @Query("SELECT sid FROM StudentIDCard sid WHERE sid.cardNumber = ?1")
    StudentIDCard findStudentIDCardByCardNumber(String cardNumber);
}

