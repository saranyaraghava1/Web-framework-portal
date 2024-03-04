package com.example.sample.Day12ce2.model;


    
    import jakarta.persistence.*;
    
    @Entity
    public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
    
        private String name;
        private int age;
    
        @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
        private StudentDetail studentDetail;
    
        public Student() {
        }
    
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    
        // Getters and Setters
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public int getAge() {
            return age;
        }
    
        public void setAge(int age) {
            this.age = age;
        }
    
        public StudentDetail getStudentDetail() {
            return studentDetail;
        }
    
        public void setStudentDetail(StudentDetail studentDetail) {
            this.studentDetail = studentDetail;
        }
    }
    
