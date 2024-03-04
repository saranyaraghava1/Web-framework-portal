package com.example.sample.Day13.service;



import com.example.sample.Day13.model.Book;

public interface BookService {
    Book addBookToAuthor(int authorId, Book book);
    String deleteBook(int id);
}

