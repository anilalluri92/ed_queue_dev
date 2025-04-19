//package com.ed.queue.service;
//
//import java.util.Date;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.ed.queue.dto.CityDTO;
//import com.ed.queue.entity.CityMaster;
//import com.ed.queue.repository.CityRepository;
// 
//@Service
//public class CityService {
//	
//	@Autowired
//	CityRepository cityRepo;
//	
//	public String saveCity(CityDTO cityDto) {
//		System.out.println("City Dto===> "+ cityDto);
//		System.out.println("CityService===> "+ cityDto);
//		CityMaster cityMaster=new CityMaster();
//		cityMaster.setId(cityDto.getId());
//		cityMaster.setName(cityDto.getName());
//		cityMaster.setStateId(cityDto.getStateId());
//		cityMaster.setCode(cityDto.getCode());
//		cityMaster.setCreatedBy(cityDto.getCreatedBy());
//		cityMaster.setStatus(cityDto.getStatus());
//		cityMaster.setCreatedDate(new Date());
//		cityRepo.save(cityMaster);
//		return "Success";
//		
//	}
//
//	public CityMaster getCityByCode(String code) {
//		return null;
//	}
//		
//	}
