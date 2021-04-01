package com.microservice.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.book.entity.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}

