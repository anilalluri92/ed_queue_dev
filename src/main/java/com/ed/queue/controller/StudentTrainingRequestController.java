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
//import com.ed.queue.dto.StudentTrainingRequestDTO;
//import com.ed.queue.entity.StudentTrainingRequestMaster;
//import com.ed.queue.service.StudentTrainingRequestService;
//
//@RestController
//@RequestMapping("/student/training/request")
//public class StudentTrainingRequestController {
//	
//	@Autowired
//	StudentTrainingRequestService studentTrainingrequestService;
//	
//	@PostMapping("/save" )
//	private String saveStudentTrainingRequest(@RequestBody StudentTrainingRequestDTO studenttrainingrequestDto) {
//		
//		System.out.println("StudentTrainingRequest Dto===> "+ studenttrainingrequestDto);
//		studentTrainingrequestService.saveStudentTrainingRequest(studenttrainingrequestDto);
//		return "Success";
//		
//	}
//
//}
//
