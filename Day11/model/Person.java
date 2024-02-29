package com.example.sample.Day11.model;
 import jakarta.persistence.*;
    @Entity
    public class Person {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String email;
        private String phoneNumber;
        private String nationality;
    
        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "address_id", referencedColumnName = "id")
        private Address address;
    
        // Constructors, getters, and setters
        public Person() {
        }
    
        public Person(String name, String email, String phoneNumber, String nationality, Address address) {
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.nationality = nationality;
            this.address = address;
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
    
        public String getEmail() {
            return email;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }
    
        public String getPhoneNumber() {
            return phoneNumber;
        }
    
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    
        public String getNationality() {
            return nationality;
        }
    
        public void setNationality(String nationality) {
            this.nationality = nationality;
        }
    
        public Address getAddress() {
            return address;
        }
    
        public void setAddress(Address address) {
            this.address = address;
        }
    
        
    }



