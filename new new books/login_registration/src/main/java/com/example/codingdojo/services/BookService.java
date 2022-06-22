package com.example.codingdojo.services;

import com.example.codingdojo.models.Book;
import com.example.codingdojo.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


//    public BookService(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

    public void createBook (Book b) {
        bookRepository.save(b);
    }

    public void updateBook (Book b) {
        bookRepository.save(b);
    }

    public List<Book> allBooks() {return bookRepository.findAll(); }

    public Book getOne(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        return book.isPresent() ? book.get() :null;
    }


}
