package com.ed.queue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ed.queue.entity.CountryMaster;

public interface CountryRepository extends JpaRepository<CountryMaster, Long>{

	CountryMaster getByCode(String Code);	

}

