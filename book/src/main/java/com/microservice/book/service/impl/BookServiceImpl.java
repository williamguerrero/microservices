package com.microservice.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservice.book.bean.BookBean;
import com.microservice.book.bean.LocationBean;
import com.microservice.book.entity.Book;
import com.microservice.book.feing.LocationClient;
import com.microservice.book.repository.BookRepository;
import com.microservice.book.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private ObjectMapper mapper;
	
	@Autowired
	private LocationClient locationClient;
	
	@Override
	public BookBean save(BookBean bean) {
		
		bean.setId(null);
		List<String> locations = new ArrayList<>();
		
		for(LocationBean locationBean: bean.getLocationsAvailable()) {
			if(locationClient.getLocationByName(locationBean.getPlaceName()) == null)
				locationBean = locationClient.saveLocation(locationBean);
			
			locations.add(locationBean.getPlaceName());
		}
		
		Book book = bookRepository.save(mapper.convertValue(bean, Book.class));
		
		return mapper.convertValue(book, BookBean.class);
	}

}
