package com.locationweb.s.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.locationweb.s.dto.Location;
@Controller
public class SearchController {

	@RequestMapping(value="/show" , method=RequestMethod.GET)
	public String showSearchLocationPage() {
		return "search_location";
	}
	@RequestMapping("/getLocation")
	public String getLocation(@RequestParam("id") long id ,ModelMap model) {
		LocationRestClient client=new LocationRestClient();
		Location location = client.getLocationDate(id);
		model.addAttribute("location", location);
		return "search_result";
	}
}
