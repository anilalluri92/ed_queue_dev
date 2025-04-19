package com.ed.queue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ed.queue.entity.UserMaster;

public interface UserRepository extends JpaRepository<UserMaster, Long>{

	UserMaster getByMobileNumber(String mobileNum);
	
	
	

}
