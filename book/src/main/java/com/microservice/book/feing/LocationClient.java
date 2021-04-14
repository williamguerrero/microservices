package com.microservice.book.feing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.microservice.book.bean.LocationBean;

@FeignClient("location-service")
public interface LocationClient {

	@RequestMapping(method = RequestMethod.GET, value = "/location/{placeName}", produces = "application/json")
	LocationBean getLocationByName(@PathVariable("placeName") String placeName);
	
	@RequestMapping(method = RequestMethod.POST, value = "/location", produces = "application/json")
	LocationBean saveLocation(@RequestBody LocationBean locationBean);
	
	
}
