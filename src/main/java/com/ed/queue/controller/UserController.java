package com.ed.queue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ed.queue.dto.UserDTO;
import com.ed.queue.entity.UserMaster;
import com.ed.queue.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/save" )
	private String saveUser(@RequestBody UserDTO userDto) {
		
		System.out.println("User Dto===> "+ userDto);
		userService.saveUser(userDto);
		return "Success";
		
	}
	
	@GetMapping("/get/{mobileNum}")
	private UserMaster getUserByMbileNumber(@PathVariable("mobileNum") String mobileNumber) {
		System.out.println("recived mobile number "+mobileNumber);
		
		return userService.getUserByMobileNumber(mobileNumber);
		
	}

}
