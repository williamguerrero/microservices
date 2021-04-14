package com.microservice.location.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservice.location.bean.LocationBean;
import com.microservice.location.entity.Location;
import com.microservice.location.repository.LocationRepository;
import com.microservice.location.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService{

	@Autowired
	LocationRepository locationRepository;
	
	@Autowired
	ObjectMapper mapper;
	
	@Override
	public Page<LocationBean> getAllLocations(Pageable pageable) {
		
		Page<Location> locations = locationRepository.findAll(pageable);
		return locations.map(loc -> mapper.convertValue(loc, LocationBean.class));
	}

	@Override
	public LocationBean save(LocationBean bean) {
		bean.setId(null);
		Location saved = locationRepository.save(mapper.convertValue(bean, Location.class));
		return mapper.convertValue(saved, LocationBean.class);
	}

	@Override
	public LocationBean getLocationByName(String placeName) {
		Location location = locationRepository.getByPlaceName(placeName);
		return mapper.convertValue(location, LocationBean.class);
	}

	
}
