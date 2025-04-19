package com.ed.queue.dto;

import java.util.Date;
import java.io.Serializable;

public class DesignationDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String shortName;
	private String code;
	private int cadreId;
	private int version;
	private int departmentId;
	private int createdBy;
	private Date createdDate;
	private boolean status;
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
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getCadreId() {
		return cadreId;
	}
	public void setCadreId(int cadreId) {
		this.cadreId = cadreId;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
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
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "DesignationDTO [id=" + id + ", name=" + name + ", shortName=" + shortName + ", code=" + code
				+ ", cadreId=" + cadreId + ", version=" + version + ", departmentId=" + departmentId + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", status=" + status + "]";
	}
}
	
