package com.example.bookgradle.controller;

import com.example.bookgradle.dto.books.BookCreate;
import com.example.bookgradle.dto.books.BookResponse;
import com.example.bookgradle.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
@RequiredArgsConstructor
public class BooksController {
    private final BookService service;
    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(service.getAllList(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody BookCreate create) {
        BookResponse bookResponse = service.create(create);
        return new ResponseEntity<>(bookResponse,HttpStatus.CREATED);
    }
}
