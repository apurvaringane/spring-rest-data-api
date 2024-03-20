package org.jspiders.springrestdataapi.service;

import org.jspiders.springrestdataapi.model.Author;
import org.jspiders.springrestdataapi.model.Book;
import org.jspiders.springrestdataapi.repository.AuthorRepository;
import org.jspiders.springrestdataapi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    public void addBook(Book b)
    {
        List<Author> authorList=new ArrayList<>();
        for (Author a:b.getAuthorList()){
            Author author=new Author();
            author.setAuthorName(a.getAuthorName());
            authorList.add(author);
            authorRepository.save(author);
        }
        b.setAuthorList(authorList);
        bookRepository.save(b);
    }
}
