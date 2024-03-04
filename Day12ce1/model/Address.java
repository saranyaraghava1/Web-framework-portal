package com.example.sample.Day12ce1.model;


    
    import jakarta.persistence.*;
    
    @Entity
    public class Address {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
    
        private String city;
        private String street;
    
        @OneToOne
        @JoinColumn(name = "employee_id")
        private Employee employee;
    
        public Address() {
        }
    
        public Address(String city, String street, Employee employee) {
            this.city = city;
            this.street = street;
            this.employee = employee;
        }
    
        // Getters and Setters
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getCity() {
            return city;
        }
    
        public void setCity(String city) {
            this.city = city;
        }
    
        public String getStreet() {
            return street;
        }
    
        public void setStreet(String street) {
            this.street = street;
        }
    
        public Employee getEmployee() {
            return employee;
        }
    
        public void setEmployee(Employee employee) {
            this.employee = employee;
        }
    }
    



