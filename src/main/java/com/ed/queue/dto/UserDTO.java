package com.ed.queue.dto;

import java.util.Date;
import java.io.Serializable;

public class UserDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String mobileNumber ;
	private String password;
	private String emailId;
	private String userType;
	private String onetimePassword;
	private String resetToken;
	private String sessId;
	private Date createdDate;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
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
	
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", password=" + password
				+ ", emailId=" + emailId + ", userType=" + userType + ", onetimePassword=" + onetimePassword
				+ ", resetToken=" + resetToken + ", sessId=" + sessId + ", createdDate=" + createdDate + "]";
	}
	
	}
	