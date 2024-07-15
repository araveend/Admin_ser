package com.auth.sec.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.sec.admin.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}