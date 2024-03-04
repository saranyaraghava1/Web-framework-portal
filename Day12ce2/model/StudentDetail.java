package com.example.sample.Day12ce2.model;


    
    import jakarta.persistence.*;
    
    @Entity
    public class StudentDetail {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
    
        private String address;
        private String phoneNumber;
    
        @OneToOne
        @JoinColumn(name = "student_id")
        private Student student;
    
        public StudentDetail() {
        }
    
        public StudentDetail(String address, String phoneNumber) {
            this.address = address;
            this.phoneNumber = phoneNumber;
        }
    
        // Getters and Setters
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getAddress() {
            return address;
        }
    
        public void setAddress(String address) {
            this.address = address;
        }
    
        public String getPhoneNumber() {
            return phoneNumber;
        }
    
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    
        public Student getStudent() {
            return student;
        }
    
        public void setStudent(Student student) {
            this.student = student;
        }
    }
    



