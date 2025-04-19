package com.ed.queue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ed.queue.dto.CountryDTO;
import com.ed.queue.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {
	
	@Autowired
	CountryService countryService;
	
	@PostMapping("/save" )
	private String saveCountry(@RequestBody CountryDTO countryDto) {
		
		System.out.println("Country Dto===> "+ countryDto);
		countryService.saveCountry(countryDto);
		return "Success";
		
	}

}

