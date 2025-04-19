// package com.ed.queue.service;
// 
// import java.util.Date;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
//
// import com.ed.queue.dto.EmailConfigDTO;
// import com.ed.queue.entity.EmailConfigMaster;
// import com.ed.queue.repository.EmailConfigRepository;
//
// @Service
//public class EmailConfigService {
//	
//	@Autowired
//	EmailConfigRepository emailconfigRepo;
//	
//	public String saveEmailConfig(EmailConfigDTO emailconfigDto) {
//		System.out.println("EmailConfig Dto===> "+ emailconfigDto);
//		System.out.println("EmailConfigService===> "+ emailconfigDto);
//		EmailConfigMaster emailconfigMaster=new EmailConfigMaster();
//		emailconfigMaster.setId(emailconfigDto.getId());
//		emailconfigMaster.setPortNumber(emailconfigDto.getPortNumber());
//		emailconfigMaster.setName(emailconfigDto.getName());
//		emailconfigMaster.setHost(emailconfigDto.getHost());
//		emailconfigMaster.setUsername(emailconfigDto.getUsername());
//		emailconfigMaster.setCreatedBy(emailconfigDto.getCreatedBy());
//		emailconfigMaster.setPassword(emailconfigDto.getPassword());
//		emailconfigMaster.setVersion(emailconfigDto.getVersion());
//		emailconfigMaster.setFromMailAddress(emailconfigDto.getFromMailAddress());
//		emailconfigMaster.setFromAlias(emailconfigDto.getFromAlias());
//		emailconfigMaster.setProtocol(emailconfigDto.getProtocol());
//		emailconfigMaster.setAuthRequired(emailconfigDto.getAuthRequired());
//		emailconfigMaster.setModifiedBy(emailconfigDto.getModifiedBy());
//		emailconfigMaster.setModifiedDate(emailconfigDto.getModifiedDate());
//		emailconfigMaster.setCode(emailconfigDto.getCode());
//		emailconfigMaster.setActiveStatus(emailconfigDto.getActiveStatus());
//		emailconfigMaster.setCreatedFromIp(emailconfigDto.getCreatedFromIp());
//		emailconfigMaster.setModifiedFromIp(emailconfigDto.getModifiedFromIp());
//		emailconfigMaster.setCreatedDate(new Date());
//		emailconfigRepo.save(emailconfigMaster);
//		return "Success";
//		
//	}
//
//	public EmailConfigMaster getEmailConfigByCode(String code) {
//		return null;
//	}
//		
//	}
//
