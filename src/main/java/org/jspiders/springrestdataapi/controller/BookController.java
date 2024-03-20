package org.jspiders.springrestdataapi.controller;

import org.jspiders.springrestdataapi.model.Book;
import org.jspiders.springrestdataapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;


    @PostMapping("/addbook")
    public void addBook(@RequestBody Book b)
    {
        bookService.addBook(b);
    }

}
