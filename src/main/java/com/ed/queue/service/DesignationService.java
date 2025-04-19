//package com.ed.queue.service;
//
//import java.util.Date;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.ed.queue.dto.DesignationDTO;
//import com.ed.queue.entity.DesignationMaster;
//import com.ed.queue.repository.DesignationRepository;
// 
//@Service
//public class DesignationService {
//	
//	@Autowired
//	DesignationRepository designationRepo;
//	
//	public String saveDesignation(DesignationDTO designationDto) {
//		System.out.println("Designation Dto===> "+ designationDto);
//		System.out.println("DesignationService===> "+ designationDto);
//		DesignationMaster designationMaster=new DesignationMaster();
//		designationMaster.setId(designationDto.getId());
//		designationMaster.setName(designationDto.getName());
//		designationMaster.setShortName(designationDto.getShortName());
//		designationMaster.setCadreId(designationDto.getCadreId());
//		designationMaster.setCode(designationDto.getCode());
//		designationMaster.setCreatedBy(designationDto.getCreatedBy());
//		designationMaster.setDepartmentId(designationDto.getDepartmentId());
//		designationMaster.setVersion(designationDto.getVersion());
//		designationMaster.setStatus(designationDto.getStatus());
//		designationMaster.setCreatedDate(new Date());
//		designationRepo.save(designationMaster);
//		return "Success";
//		
//	}
//
//	public DesignationMaster getDesignationByCode(String code) {
//		return null;
//	}
//		
//	}
