package com.ed.queue.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ed.queue.dto.CountryDTO;
import com.ed.queue.entity.CountryMaster;
import com.ed.queue.repository.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	CountryRepository countryRepo;
	
	public String saveCountry(CountryDTO countryDto) {
		System.out.println("Country Dto===> "+ countryDto);
		System.out.println("CountryService===> "+ countryDto);
		CountryMaster countryMaster=new CountryMaster();
		countryMaster.setId(countryDto.getId());
		countryMaster.setName(countryDto.getName());
		countryMaster.setCode(countryDto.getCode());
		countryMaster.setCreatedBy(countryDto.getCreatedBy());
		countryMaster.setActiveStatus(countryDto.getActiveStatus());
		countryMaster.setCreatedDate(new Date());
		countryRepo.save(countryMaster);
		return "Success";
		
	}

	public CountryMaster getCountryByCode(String code) {
		return null;
	}
		
	}


