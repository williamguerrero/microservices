package com.microservice.basic.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.microservice.basic.bean.LocationBean;

public interface LocationService {
	
	public Page<LocationBean> getAllLocations(Pageable pageable);

	public LocationBean save(LocationBean bean);
	
}
