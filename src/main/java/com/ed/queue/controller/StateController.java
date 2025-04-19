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
//import com.ed.queue.dto.StateDTO;
//import com.ed.queue.entity.StateMaster;
//import com.ed.queue.service.StateService;
//
//@RestController
//@RequestMapping("/state")
//public class StateController {
//	
//	@Autowired
//	StateService stateService;
//	
//	
//	@PostMapping("/save" )
//	private String saveState(@RequestBody StateDTO stateDto) {
//		
//		System.out.println("State Dto===> "+ stateDto);
//		stateService.saveState(stateDto);
//		return "Success";
//		
//	}
//
//}
