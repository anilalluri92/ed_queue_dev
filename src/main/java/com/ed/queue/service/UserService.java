package com.ed.queue.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ed.queue.dto.UserDTO;
import com.ed.queue.entity.UserMaster;
import com.ed.queue.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public String saveUser(UserDTO userDto) {
		System.out.println("User Dto===> "+ userDto);
		System.out.println("UserService===> "+ userDto);
		UserMaster userMaster=new UserMaster();
		userMaster.setId(userDto.getId());
		userMaster.setName(userDto.getName());
		userMaster.setMobileNumber(userDto.getMobileNumber());
		userMaster.setPassword(userDto.getPassword());
		userMaster.setEmailId(userDto.getEmailId());
		userMaster.setUserType(userDto.getUserType());
		userMaster.setOnetimePassword(userDto.getOnetimePassword());
		userMaster.setResetToken(userDto.getResetToken());
		userMaster.setSessId(userDto.getSessId());
		userMaster.setCreatedDate(new Date());
		userRepo.save(userMaster);
		return "Success";
		
	}
	
	public UserMaster getUserByMobileNumber(String mobileNum) {
		return userRepo.getByMobileNumber(mobileNum);
		
	}

}
