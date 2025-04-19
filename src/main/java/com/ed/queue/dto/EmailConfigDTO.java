package com.ed.queue.dto;

import java.util.Date;

import java.io.Serializable;

	public class EmailConfigDTO implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private Long id;
		private int portNumber;
		private String name;
		private String host;
		private String username ;
		private String password;
		private String fromMailAddress ;
		private String fromAlias;
		private String protocol;
		private int createdBy;
		private Date createdDate;
		private boolean authRequired;
		private int modifiedBy;
		private Date modifiedDate;
		private boolean activeStatus;
		private int version;
		private String code;
		private String createdFromIp;
		private String modifiedFromIp;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public int getPortNumber() {
			return portNumber;
		}
		public void setPortNumber(int portNumber) {
			this.portNumber = portNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getHost() {
			return host;
		}
		public void setHost(String host) {
			this.host = host;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getFromMailAddress() {
			return fromMailAddress;
		}
		public void setFromMailAddress(String fromMailAddress) {
			this.fromMailAddress = fromMailAddress;
		}
		public String getFromAlias() {
			return fromAlias;
		}
		public void setFromAlias(String fromAlias) {
			this.fromAlias = fromAlias;
		}
		public String getProtocol() {
			return protocol;
		}
		public void setProtocol(String protocol) {
			this.protocol = protocol;
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
		public boolean getAuthRequired() {
			return authRequired;
		}
		public void setAuthRequired(boolean authRequired) {
			this.authRequired = authRequired;
		}
		public int getModifiedBy() {
			return modifiedBy;
		}
		public void setModifiedBy(int modifiedBy) {
			this.modifiedBy = modifiedBy;
		}
		public Date getModifiedDate() {
			return modifiedDate;
		}
		public void setModifiedDate(Date modifiedDate) {
			this.modifiedDate = modifiedDate;
		}
		public boolean getActiveStatus() {
			return activeStatus;
		}
		public void setActiveStatus(boolean activeStatus) {
			this.activeStatus = activeStatus;
		}
		public int getVersion() {
			return version;
		}
		public void setVersion(int version) {
			this.version = version;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getCreatedFromIp() {
			return createdFromIp;
		}
		public void setCreatedFromIp(String createdFromIp) {
			this.createdFromIp = createdFromIp;
		}
		public String getModifiedFromIp() {
			return modifiedFromIp;
		}
		public void setModifiedFromIp(String modifiedFromIp) {
			this.modifiedFromIp = modifiedFromIp;
		}
		@Override
		public String toString() {
			return "EmailConfigDTO [id=" + id + ", portNumber=" + portNumber + ", name=" + name + ", host=" + host
					+ ", username=" + username + ", password=" + password + ", fromMailAddress=" + fromMailAddress
					+ ", fromAlias=" + fromAlias + ", protocol=" + protocol + ", createdBy=" + createdBy
					+ ", createdDate=" + createdDate + ", authRequired=" + authRequired + ", modifiedBy=" + modifiedBy
					+ ", modifiedDate=" + modifiedDate + ", activeStatus=" + activeStatus + ", version=" + version
					+ ", code=" + code + ", createdFromIp=" + createdFromIp + ", modifiedFromIp=" + modifiedFromIp
					+ "]";
		}
		
	}
		
