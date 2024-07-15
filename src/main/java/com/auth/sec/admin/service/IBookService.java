package com.auth.sec.admin.service;

import java.util.List;
import java.util.Optional;

import com.auth.sec.admin.entity.Book;

public interface IBookService {
    List<Book> getAllBooks();
    Book add(Book book);
   Optional<Book> findById(Long bookId);
    void delete(Long bookId);
    Book update(Book book);
}