package com.example.sample.Day13.controller;



import com.example.sample.Day13.model.Book;
import com.example.sample.Day13.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/author/{authorId}")
    public ResponseEntity<Book> addBookToAuthor(@PathVariable int authorId, @RequestBody Book book) {
        Book addedBook = bookService.addBookToAuthor(authorId, book);
        return new ResponseEntity<>(addedBook, HttpStatus.CREATED);
    }

    @DeleteMapping("/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable int bookId) {
        String result = bookService.deleteBook(bookId);
        if (result.equals("Book deleted successfully")) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Book not found with ID: " + bookId, HttpStatus.NOT_FOUND);
        }
    }
}

