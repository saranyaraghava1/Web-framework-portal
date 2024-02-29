package com.example.sample.Day11ce2.model;


    import jakarta.persistence.*;
    
    @Entity
    public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
    
        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "student_id_card_id", referencedColumnName = "id")
        private StudentIDCard studentIDCard;
    public Student(){}
    public Student(Long id, String name, StudentIDCard studentIDCard) {
        this.id = id;
        this.name = name;
        this.studentIDCard = studentIDCard;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public StudentIDCard getStudentIDCard() {
        return studentIDCard;
    }
    public void setStudentIDCard(StudentIDCard studentIDCard) {
        this.studentIDCard = studentIDCard;
    }
    
       
    }



