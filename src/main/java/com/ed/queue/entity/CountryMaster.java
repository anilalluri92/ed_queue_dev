package com.ed.queue.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Entity;
@Entity
@Table(name="country_master")

public class CountryMaster<USERMASTER> {
	@Id
	@Column(name="id")
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="code")
	private String code ;
	 @ManyToOne
	    @JoinColumn(name = "user_master", nullable = false)
	    private UserMaster createdBy;
	 
	@Column(name="created_date")
	private Date createdDate;
	@Column(name="active_status")
	private Boolean activeStatus;
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

	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Boolean getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

}
