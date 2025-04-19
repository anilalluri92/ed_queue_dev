package com.ed.queue.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name="user_master")
public class UserMaster {
	
	@Id
	@Column(name="id")
	private Long id;
	@Column(name="username")
	private String name;
	@Column(name="mobile_number")
	private String mobileNumber ;
	@Column(name="password")
	private String password;
	@Column(name="email_id")
	private String emailId;
	@Column(name="user_type")
	private String userType;
	@Column(name="onetime_password")
	private String onetimePassword;
	@Column(name="reset_token")
	private String resetToken;
	@Column(name="sess_id")
	private String sessId;
	@Column(name="created_date")
	private Date createdDate;
	
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getOnetimePassword() {
		return onetimePassword;
	}
	public void setOnetimePassword(String onetimePassword) {
		this.onetimePassword = onetimePassword;
	}
	public String getResetToken() {
		return resetToken;
	}
	public void setResetToken(String resetToken) {
		this.resetToken = resetToken;
	}
	public String getSessId() {
		return sessId;
	}
	public void setSessId(String sessId) {
		this.sessId = sessId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	

}
