//package com.ed.queue.service;
//
//import java.util.Date;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.ed.queue.dto.StudentTrainingRequestDTO;
//import com.ed.queue.entity.StudentTrainingRequestMaster;
//import com.ed.queue.repository.StudentTrainingRequestRepository;
//
//@Service
//public class StudentTrainingRequestService {
//	@Autowired
//	StudentTrainingRequestRepository studenttrainingrequestRepo;
//	
//	public String saveStudentTrainingRequest(StudentTrainingRequestDTO studenttrainingrequestDto) {
//		System.out.println("StudentTrainingRequest Dto===> "+ studenttrainingrequestDto);
//		System.out.println("StudentTrainingRequestService===> "+ studenttrainingrequestDto);
//		StudentTrainingRequestMaster studenttrainingrequestMaster=new StudentTrainingRequestMaster();
//		studenttrainingrequestMaster.setId(studenttrainingrequestDto.getId());
//		studenttrainingrequestMaster.setInstitutionName(studenttrainingrequestDto.getInstitutionName());
//		studenttrainingrequestMaster.setScheduledStartDate(studenttrainingrequest.getScheduledStartDate());
//		studenttrainingrequestMaster.setScheduledEndDate(studenttrainingrequestDto.getScheduledEndDate());
//		studenttrainingrequestMaster.setScheduledStartTime(studenttrainingrequestDto.getScheduledStartTime());
//		studenttrainingrequestMaster.setScheduledEndTime(studenttrainingrequestDto.getScheduledEndTime());
//		studenttrainingrequestMaster.setPurposeOfTraining(studenttrainingrequestDto.getPurposeOfTraining());
//		studenttrainingrequestMaster.setSubject(studenttrainingrequestDto.getSubject());
//		studenttrainingrequestMaster.setInstitutionAddress1(studenttrainingrequestDto.getInstitutionAddress1());
//		studenttrainingrequestMaster.setInstitutionAddress2(studenttrainingrequestDto.getInstitutionAddress2());
//		studenttrainingrequestMaster.setInstitutionAddress3(studenttrainingrequestDto.getInstitutionAddress3());
//		studenttrainingrequestMaster.setInstitutionRepresentativeName(studenttrainingrequestDto.getInstitutionRepresentativeName());
//		studenttrainingrequestMaster.setContactNumber(studenttrainingrequestDto.getContactNumber());
//		studenttrainingrequestMaster.setEmailId(studenttrainingrequestDto.getEmailId());
//		studenttrainingrequestMaster.setNoOfStudents(studenttrainingrequestDto.getNoOfStudents());
//		studenttrainingrequestMaster.setDocumentPath(studenttrainingrequestDto.getDocumentPath());
//		studenttrainingrequestMaster.setActiveStatus(studenttrainingrequestDto.getActiveStatus());
//		studenttrainingrequestMaster.setCreatedBy(studenttrainingrequestDto.getCreatedBy());
//		studenttrainingrequestMaster.setModifiedBy(studenttrainingrequestDto.getModifiedBy());
//		studenttrainingrequestMaster.setModifiedDate(studenttrainingrequestDto.getModifiedDate());
//		studenttrainingrequestMaster.setVersion(studenttrainingrequestDto.getVersion());
//		studenttrainingrequestMaster.setNumberOfDays(studenttrainingrequestDto.getNumberOfDays());
//		studenttrainingrequestMaster.setRefNumber(studenttrainingrequestDto.getRefNumber());
//		studenttrainingrequestMaster.setCreatedFromIp(studenttrainingrequestDto.getCreatedFromIp());
//		studenttrainingrequestMaster.setModifiedFromIp(studenttrainingrequestDto.getModifiedFromIp());
//		studenttrainingrequestMaster.setCreatedDate(new Date());
//		studenttrainingrequestRepo.save(studenttrainingrequestMaster);
//		return "Success";
//		
//	}
//
//	public StudentTrainingRequestMaster getStudentTrainingRequestByCode(String code) {
//		return null;
//	}
//		
//	}
//
