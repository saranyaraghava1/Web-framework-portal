package com.example.sample.Day13.service;



import com.example.sample.Day13.model.Author;
// import com.example.sample.Day13.model.Book;

import java.util.List;

public interface AuthorService {
    Author createAuthor(Author author);
    Author updateAuthor(int id, Author author);
    Author getAuthor(int id);
    List<Author> getAllAuthors();
}


