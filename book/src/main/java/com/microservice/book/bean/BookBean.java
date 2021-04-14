package com.microservice.book.bean;

import java.util.List;

public class BookBean {
	
	Long id;
	String name;
	String isbn;
	String publishedDate;
	List<LocationBean> locationsAvailable;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public List<LocationBean> getLocationsAvailable() {
		return locationsAvailable;
	}
	public void setLocationsAvailable(List<LocationBean> locationsAvailable) {
		this.locationsAvailable = locationsAvailable;
	}
	
	
	
}
