//package com.ed.queue.service;
//
//import java.util.Date;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.ed.queue.dto.EmailMessageDTO;
//import com.ed.queue.entity.EmailMessageMaster;
//import com.ed.queue.repository.EmailMessageRepository;
// 
//@Service
//public class EmailMessageService {
//	
//	@Autowired
//	EmailMessageRepository emailmessageRepo;
//	
//	public String saveEmailMessage(EmailMessageDTO emailmessageDto) {
//		System.out.println("EmailMessage Dto===> "+ emailmessageDto);
//		System.out.println("EmailMessageService===> "+ emailmessageDto);
//		EmailMessageMaster emailmessageMaster=new EmailMessageMaster();
//		emailmessageMaster.setId(emailmessageDto.getId());
//		emailmessageMaster.setConfigId(emailmessageDto.getConfigId());
//		emailmessageMaster.setMailSubject(emailmessageDto.getMailSubject());
//		emailmessageMaster.setRemarks(emailmessageDto.getRemarks());
//		emailmessageMaster.setToAddress(emailmessageDto.getToAddress());
//		emailmessageMaster.setCreatedBy(emailmessageDto.getCreatedBy());
//		emailmessageMaster.setBccAddress(emailmessageDto.getBccAddress());
//		emailmessageMaster.setVersion(emailmessageDto.getVersion());
//		emailmessageMaster.setMailMessage(emailmessageDto.getMailMessage());
//		emailmessageMaster.setContentType(emailmessageDto.getContentType());
//		emailmessageMaster.setAttachmentPath(emailmessageDto.getAttachmentPath());
//		emailmessageMaster.setCcAddress(emailmessageDto.getCcAddress());
//		emailmessageMaster.setModifiedBy(emailmessageDto.getModifiedBy());
//		emailmessageMaster.setModifiedDate(emailmessageDto.getModifiedDate());
//		emailmessageMaster.setMailSent(emailmessageDto.getMailSent());
//		emailmessageMaster.setImportantMail(emailmessageDto.getImportantMail());
//		emailmessageMaster.setSentByScheduler(emailmessageDto.getSentByScheduler());
//		emailmessageMaster.setCreatedFromIp(emailmessageDto.getCreatedFromIp());
//		emailmessageMaster.setModifiedFromIp(emailmessageDto.getModifiedFromIp());
//		emailmessageMaster.setCreatedDate(new Date());
//		emailmessageRepo.save(emailmessageMaster);
//		return "Success";
//		
//	}
//
//	public EmailMessageMaster getEmailMessageByCode(String code) {
//		return null;
//	}
//		
//	}
