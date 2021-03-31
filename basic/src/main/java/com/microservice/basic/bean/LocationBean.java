package com.microservice.basic.bean;

import lombok.Data;

@Data
public class LocationBean {
	Long id;
	
	String placeName;
	
	Float latitude;
	
	Float longitude;
}
