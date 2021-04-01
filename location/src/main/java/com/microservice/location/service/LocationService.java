package com.microservice.location.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.microservice.location.bean.LocationBean;

public interface LocationService {
	
	public Page<LocationBean> getAllLocations(Pageable pageable);

	public LocationBean save(LocationBean bean);
	
}
