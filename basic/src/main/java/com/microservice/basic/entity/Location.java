package com.microservice.basic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Location {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable = false)
	Long id;
	
	@Column(nullable = true)
	String placeName;
	
	@Column(nullable = false)
	Float latitude;
	
	@Column(nullable = false)
	Float longitude;
	
}
