package com.example.sample.Day11ce2.model;


    
    import jakarta.persistence.*;
    
    @Entity
    public class StudentIDCard {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String cardNumber;
    
       public StudentIDCard(){}
    
    public StudentIDCard(Long id, String cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getCardNumber() {
        return cardNumber;
    }
    
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
       
    
    }



