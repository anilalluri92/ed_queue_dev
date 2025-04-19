//package com.ed.queue.service;
//
//import java.util.Date;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.ed.queue.dto.StateDTO;
//import com.ed.queue.entity.StateMaster;
//import com.ed.queue.repository.StateRepository;
//
//@Service
//
//public class StateService {
//	@Autowired
//	StateRepository stateRepo;
//	
//	public String saveState(StateDTO stateDto) {
//		System.out.println("State Dto===> "+ stateDto);
//		System.out.println("StateService===> "+ stateDto);
//		StateMaster stateMaster=new StateMaster();
//		stateMaster.setId(stateDto.getId());
//		stateMaster.setCountryId(stateDto.getCountryId());
//		stateMaster.setCode(stateDto.getCode());
//		stateMaster.setName(stateDto.getName());
//		stateMaster.setCreatedBy(stateDto.getCreatedBy());
//		stateMaster.setStatus(stateDto.getStatus());
//		stateMaster.setCreatedDate(new Date());
//		stateRepo.save(stateMaster);
//		return "Success";
//		
//	}
//
//	public StateMaster getStateByCode(String code) {
//		return null;
//	}
//		
//	}
//
