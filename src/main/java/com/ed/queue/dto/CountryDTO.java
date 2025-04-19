package com.ed.queue.dto;

import java.util.Date;
import java.io.Serializable;

public class CountryDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String code;
	private int createdBy;
	private Date createdDate;
	private boolean activeStatus;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public boolean getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}
	@Override
	public String toString() {
		return "CountryDTO [id=" + id + ", name=" + name + ", code=" + code + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", activeStatus=" + activeStatus + "]";
	}
	


}
