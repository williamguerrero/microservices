package com.microservice.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.book.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
}
