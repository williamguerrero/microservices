package com.microservice.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.basic.bean.LocationBean;
import com.microservice.basic.service.LocationService;

@RestController
@RequestMapping("/location")
public class LocationController {
	
	@Autowired
	LocationService locationService;
	
	@GetMapping
	public Page<LocationBean> getLocations(final Pageable pageable) {
		return locationService.getAllLocations(pageable);
	}
	
	@PostMapping
	public LocationBean putLocation(@RequestBody LocationBean bean) {
		return locationService.save(bean);
	}
	
}
