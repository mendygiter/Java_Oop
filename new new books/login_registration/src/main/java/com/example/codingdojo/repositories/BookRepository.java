package com.example.codingdojo.repositories;

import com.example.codingdojo.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    //    Send back a list of books
    List<Book> findAll();


}
