//package com.ed.queue.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.ed.queue.dto.CityDTO;
//import com.ed.queue.entity.CityMaster;
//import com.ed.queue.service.CityService;
//
//@RestController
//@RequestMapping("/city")
//public class CityController {
//	
//	@Autowired
//	CityService cityService;
//	
//	@PostMapping("/save" )
//	private String saveCity(@RequestBody CityDTO cityDto) {
//		
//		System.out.println("City Dto===> "+ cityDto);
//		cityService.saveCity(cityDto);
//		return "Success";
//		
//	}
//	
//	@GetMapping("/get/{name}")
//	private CityMaster getCityByCode(@PathVariable("code") String code) {
//		System.out.println("recived "+code);
//		
//		return cityService.getCityByCode(code);
//		
//	}
//
//}
