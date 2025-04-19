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
//import com.ed.queue.dto.EmailConfigDTO;
//import com.ed.queue.entity.EmailConfigMaster;
//import com.ed.queue.service.EmailConfigService;
//
//@RestController
//@RequestMapping("/emailconfig")
//public class EmailConfigController {
//	
//	@Autowired
//	EmailConfigService emailconfigService;
//	
//	@PostMapping("/save" )
//	private String saveEmailConfig(@RequestBody EmailConfigDTO emailconfigDto) {
//		
//		System.out.println("EmailConfig Dto===> "+ emailconfigDto);
//		emailconfigService.saveEmailConfig(emailconfigDto);
//		return "Success";
//		
//	}
//	
//	@GetMapping("/get/{name}")
//	private EmailConfigMaster getEmailConfigByCode(@PathVariable("code") String code) {
//		System.out.println("recived "+code);
//		
//		return emailconfigService.getEmailConfigByCode(code);
//		
//	}
//
//}
