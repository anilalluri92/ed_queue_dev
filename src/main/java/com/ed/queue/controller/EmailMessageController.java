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
//import com.ed.queue.dto.EmailMessageDTO;
//import com.ed.queue.entity.EmailMessageMaster;
//import com.ed.queue.service.EmailMessageService;
//
//@RestController
//@RequestMapping("/emailmessage")
//public class EmailMessageController {
//	
//	@Autowired
//	EmailMessageService emailmessageService;
//	
//	@PostMapping("/save" )
//	private String saveEmailMessage(@RequestBody EmailMessageDTO emailmessageDto) {
//		
//		System.out.println("EmailMessage Dto===> "+ emailmessageDto);
//		emailmessageService.saveEmailMessage(emailmessageDto);
//		return "Success";
//		
//	}
//	
//	@GetMapping("/get/{name}")
//	private EmailMessageMaster getEmailMessageByCode(@PathVariable("code") String code) {
//		System.out.println("recived "+code);
//		
//		return emailmessageService.getEmailMessageByCode(code);
//		
//	}
//
//}
//
