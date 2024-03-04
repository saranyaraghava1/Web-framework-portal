package com.example.sample.Day13.model;


    
    import com.fasterxml.jackson.annotation.JsonManagedReference;
   
    
    import jakarta.persistence.*;
    import java.util.List;
    
 
    @Entity
    public class Author {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
    
        private String name;
        private String email;
        private String phoneNumber;
        private String address;
    
        @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
        @JsonManagedReference
        private List<Book> books;
    
        // Constructors
        public Author() {}
    
        public Author(String name, String email, String phoneNumber, String address) {
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.address = address;
        }

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

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public List<Book> getBooks() {
            return books;
        }

        public void setBooks(List<Book> books) {
            this.books = books;
        }
    
        
    }
    



