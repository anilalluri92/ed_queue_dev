//package com.ed.queue.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.Date;
//import javax.persistence.Entity;
//@Entity
//@Table(name="emailmessage_master")
//
//public class EmailMessageMaster {
//	@Id
//	@Column(name="id")
//	private Long id;
//	@Column(name="config_id")
//	private int configId;
//	@Column(name="mail_subject")
//	private String mailSubject;
//	@Column(name="remarks")
//	private String remarks;
//	@Column(name="to_address")
//	private String toAddress ;
//	@Column(name="bcc_address")
//	private String bccAddress;
//	@Column(name="mail_message")
//	private String mailMessage ;
//	@Column(name="content_type")
//	private String contentType;
//	@Column(name="attachment_path")
//	private String attachmentPath;
//	@Column(name="created_by")
//	private int createdBy;
//	@Column(name="created_date")
//	private Date createdDate;
//	@Column(name="cc_address")
//	private String ccAddress;
//	@Column(name="modified_by")
//	private int modifiedBy;
//	@Column(name="modified_date")
//	private Date modifiedDate;
//	@Column(name="mail_sent")
//	private String mailSent;
//	@Column(name="important_mail")
//	private String importantMail;
//	@Column(name="version")
//	private int version;
//	@Column(name="sent_by_scheduler")
//	private String sentByScheduler;
//	@Column(name="created_from_ip")
//	private String createdFromIp;
//	@Column(name="modified_from_ip")
//	private String modifiedFromIp;
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public int getConfigId() {
//		return configId;
//	}
//	public void setConfigId(int configId) {
//		this.configId = configId;
//	}
//	public String getMailSubject() {
//		return mailSubject;
//	}
//	public void setMailSubject(String mailSubject) {
//		this.mailSubject = mailSubject;
//	}
//	public String getRemarks() {
//		return remarks;
//	}
//	public void setRemarks(String remarks) {
//		this.remarks = remarks;
//	}
//	public String getToAddress() {
//		return toAddress;
//	}
//	public void setToAddress(String toAddress) {
//		this.toAddress = toAddress;
//	}
//	public String getBccAddress() {
//		return bccAddress;
//	}
//	public void setBccAddress(String bccAddress) {
//		this.bccAddress = bccAddress;
//	}
//	public String getMailMessage() {
//		return mailMessage;
//	}
//	public void setMailMessage(String mailMessage) {
//		this.mailMessage = mailMessage;
//	}
//	public String getContentType() {
//		return contentType;
//	}
//	public void setContentType(String contentType) {
//		this.contentType = contentType;
//	}
//	public String getAttachmentPath() {
//		return attachmentPath;
//	}
//	public void setAttachmentPath(String attachmentPath) {
//		this.attachmentPath = attachmentPath;
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
//	public String getCcAddress() {
//		return ccAddress;
//	}
//	public void setCcAddress(String ccAddress) {
//		this.ccAddress = ccAddress;
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
//	public String getMailSent() {
//		return mailSent;
//	}
//	public void setMailSent(String mailSent) {
//		this.mailSent = mailSent;
//	}
//	public String getImportantMail() {
//		return importantMail;
//	}
//	public void setImportantMail(String importantMail) {
//		this.importantMail = importantMail;
//	}
//	public int getVersion() {
//		return version;
//	}
//	public void setVersion(int version) {
//		this.version = version;
//	}
//	public String getSentByScheduler() {
//		return sentByScheduler;
//	}
//	public void setSentByScheduler(String sentByScheduler) {
//		this.sentByScheduler = sentByScheduler;
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
//
//}
