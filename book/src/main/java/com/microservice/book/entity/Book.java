package com.microservice.book.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable = false)
	Long id;
	
	@Column(nullable = false)
	String name;
	
	@Column(nullable = false)
	String isbn;
	
	@Column(nullable = true)
	String publishedDate;
	
	@Column(nullable = true)
	List<String> locationsAvailable;
	
}
