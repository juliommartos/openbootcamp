package com.jmm.obrestdatajpa.controller;

import com.jmm.obrestdatajpa.entities.Book;
import com.jmm.obrestdatajpa.repository.BookRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    private final BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    /**
     * http://localhost:8080/api/books
     * 
     * @return
     */
    @GetMapping("/api/books")
    public List<Book> findAll() {
        return repository.findAll();
    }

    @GetMapping("/api/books/{id}")
    public ResponseEntity<Book> findOneById(@PathVariable Long id) {

        Optional<Book> bookOpt = repository.findById(id);

        // Option 1
        if (bookOpt.isPresent()) {
            return ResponseEntity.ok(bookOpt.get());
        } else {
            return ResponseEntity.notFound().build();
        }

        // return bookOpt.map(ResponseEntity::ok).orElseGet(() ->
        // ResponseEntity.notFound().build());

    }

    @PostMapping("/api/books")
    public Book create(@RequestBody Book book, @RequestHeader HttpHeaders headers) {
        System.out.println(headers.get("User-Agent"));
        repository.save(book);
        return book;
    }

}
