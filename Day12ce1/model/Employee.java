package com.example.sample.Day12ce1.model;


    
    import jakarta.persistence.*;
    
    @Entity
    public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
    
        private String name;
    
        @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
        private Address address;
    
        public Employee() {
        }
    
        public Employee(String name, Address address) {
            this.name = name;
            this.address = address;
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
    
        public Address getAddress() {
            return address;
        }
    
        public void setAddress(Address address) {
            this.address = address;
        }
    }
    



