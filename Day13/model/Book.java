package com.example.sample.Day13.model;


    
    import com.fasterxml.jackson.annotation.JsonBackReference;
    
    
    import jakarta.persistence.*;
    
    
    @Entity
    public class Book {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
    
        private String title;
        private String genre;
        private int publicationYear;
        private String isbn;
        private double price;
    
        @ManyToOne
        @JoinColumn(name = "author_id")
        @JsonBackReference
        private Author author;
    
        // Constructors
        public Book() {}
    
        public Book(String title, String genre, int publicationYear, String isbn, double price, Author author) {
            this.title = title;
            this.genre = genre;
            this.publicationYear = publicationYear;
            this.isbn = isbn;
            this.price = price;
            this.author = author;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public int getPublicationYear() {
            return publicationYear;
        }

        public void setPublicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }
    
        // Getters and setters
        // You can generate them using your IDE or Lombok annotations
        
    }
