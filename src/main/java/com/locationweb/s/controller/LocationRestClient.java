package com.locationweb.s.controller;

import org.springframework.web.client.RestTemplate;

import com.locationweb.s.dto.Location;

public class LocationRestClient {

	public Location getLocationDate(long id) {
		RestTemplate restTemplate =new RestTemplate();
		Location location = restTemplate.getForObject("http://localhost:8080/location/api/get/"+id, Location.class);
		return location;
	}
}
