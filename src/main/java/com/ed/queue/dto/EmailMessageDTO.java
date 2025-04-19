package com.ed.queue.dto;

import java.util.Date;
import java.io.Serializable;

	public class EmailMessageDTO implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private Long id;
		private int configId;
		private String mailSubject;
		private String remarks;
		private String toAddress;
		private String bccAddress;
		private String mailMessage ;
		private String contentType;
		private String attachmentPath;
		private int createdBy;
		private Date createdDate;
		private String ccAddress;
		private int modifiedBy;
		private Date modifiedDate;
		private String mailSent;
		private String importantMail;
		private int version;
		private String sentByScheduler;
		private String createdFromIp;
		private String modifiedFromIp;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public int getConfigId() {
			return configId;
		}
		public void setConfigId(int configId) {
			this.configId = configId;
		}
		public String getMailSubject() {
			return mailSubject;
		}
		public void setMailSubject(String mailSubject) {
			this.mailSubject = mailSubject;
		}
		public String getRemarks() {
			return remarks;
		}
		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
		public String getToAddress() {
			return toAddress;
		}
		public void setToAddress(String toAddress) {
			this.toAddress = toAddress;
		}
		public String getBccAddress() {
			return bccAddress;
		}
		public void setBccAddress(String bccAddress) {
			this.bccAddress = bccAddress;
		}
		public String getMailMessage() {
			return mailMessage;
		}
		public void setMailMessage(String mailMessage) {
			this.mailMessage = mailMessage;
		}
		public String getContentType() {
			return contentType;
		}
		public void setContentType(String contentType) {
			this.contentType = contentType;
		}
		public String getAttachmentPath() {
			return attachmentPath;
		}
		public void setAttachmentPath(String attachmentPath) {
			this.attachmentPath = attachmentPath;
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
		public String getCcAddress() {
			return ccAddress;
		}
		public void setCcAddress(String ccAddress) {
			this.ccAddress = ccAddress;
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
		public String getMailSent() {
			return mailSent;
		}
		public void setMailSent(String mailSent) {
			this.mailSent = mailSent;
		}
		public String getImportantMail() {
			return importantMail;
		}
		public void setImportantMail(String importantMail) {
			this.importantMail = importantMail;
		}
		public int getVersion() {
			return version;
		}
		public void setVersion(int version) {
			this.version = version;
		}
		public String getSentByScheduler() {
			return sentByScheduler;
		}
		public void setSentByScheduler(String sentByScheduler) {
			this.sentByScheduler = sentByScheduler;
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
			return "EmailMessageDTO [id=" + id + ", configId=" + configId + ", mailSubject=" + mailSubject
					+ ", remarks=" + remarks + ", toAddress=" + toAddress + ", bccAddress=" + bccAddress
					+ ", mailMessage=" + mailMessage + ", contentType=" + contentType + ", attachmentPath="
					+ attachmentPath + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", ccAddress="
					+ ccAddress + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + ", mailSent="
					+ mailSent + ", importantMail=" + importantMail + ", version=" + version + ", sentByScheduler="
					+ sentByScheduler + ", createdFromIp=" + createdFromIp + ", modifiedFromIp=" + modifiedFromIp + "]";
		}
		
	}
		
