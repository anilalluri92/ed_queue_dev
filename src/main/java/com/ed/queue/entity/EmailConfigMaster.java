//package com.ed.queue.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.Date;
//import javax.persistence.Entity;
//@Entity
//@Table(name="emailconfig_master")
//
//public class EmailConfigMaster {
//	@Id
//	@Column(name="id")
//	private Long id;
//	@Column(name="port_number")
//	private int portNumber ;
//	@Column(name="name")
//	private String name;
//	@Column(name="host")
//	private String host;
//	@Column(name="username")
//	private String username ;
//	@Column(name="password")
//	private String password;
//	@Column(name="from_mail_address")
//	private String fromMailAddress ;
//	@Column(name="from_alias")
//	private String fromAlias;
//	@Column(name="protocol")
//	private String protocol;
//	@Column(name="created_by")
//	private int createdBy;
//	@Column(name="created_date")
//	private Date createdDate;
//	@Column(name="auth_required")
//	private boolean authRequired;
//	@Column(name="modified_by")
//	private int modifiedBy;
//	@Column(name="modified_date")
//	private Date modifiedDate;
//	@Column(name="active_status")
//	private boolean activeStatus;
//	@Column(name="version")
//	private int version;
//	@Column(name="code")
//	private String code;
//	@Column(name="created_from_ip")
//	private String createdFromIp;
//	@Column(name="modified_from_ip")
//	private String modifiedFromIp;
//	
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public int getPortNumber() {
//		return portNumber;
//	}
//	public void setPortNumber(int portNumber) {
//		this.portNumber = portNumber;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getHost() {
//		return host;
//	}
//	public void setHost(String host) {
//		this.host = host;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getFromMailAddress() {
//		return fromMailAddress;
//	}
//	public void setFromMailAddress(String fromMailAddress) {
//		this.fromMailAddress = fromMailAddress;
//	}
//	public String getFromAlias() {
//		return fromAlias;
//	}
//	public void setFromAlias(String fromAlias) {
//		this.fromAlias = fromAlias;
//	}
//	public String getProtocol() {
//		return protocol;
//	}
//	public void setProtocol(String protocol) {
//		this.protocol = protocol;
//	}
//	public int getCreatedBy() {
//		return createdBy;
//	}
//	public void setCreatedBy(int createdBy) {
//		this.createdBy = createdBy;
//	}
//	public Date getCreatedDate() {
//		return createdDate;
//	}
//	public void setCreatedDate(Date createdDate) {
//		this.createdDate = createdDate;
//	}
//	public boolean getAuthRequired() {
//		return authRequired;
//	}
//	public void setAuthRequired(boolean authRequired) {
//		this.authRequired = authRequired;
//	}
//	public int getModifiedBy() {
//		return modifiedBy;
//	}
//	public void setModifiedBy(int modifiedBy) {
//		this.modifiedBy = modifiedBy;
//	}
//	public Date getModifiedDate() {
//		return modifiedDate;
//	}
//	public void setModifiedDate(Date modifiedDate) {
//		this.modifiedDate = modifiedDate;
//	}
//	public boolean getActiveStatus() {
//		return activeStatus;
//	}
//	public void setActiveStatus(boolean activeStatus) {
//		this.activeStatus = activeStatus;
//	}
//	public int getVersion() {
//		return version;
//	}
//	public void setVersion(int version) {
//		this.version = version;
//	}
//	public String getCode() {
//		return code;
//	}
//	public void setCode(String code) {
//		this.code = code;
//	}
//	public String getCreatedFromIp() {
//		return createdFromIp;
//	}
//	public void setCreatedFromIp(String createdFromIp) {
//		this.createdFromIp = createdFromIp;
//	}
//	public String getModifiedFromIp() {
//		return modifiedFromIp;
//	}
//	public void setModifiedFromIp(String modifiedFromIp) {
//		this.modifiedFromIp = modifiedFromIp;
//	}
//
//}
