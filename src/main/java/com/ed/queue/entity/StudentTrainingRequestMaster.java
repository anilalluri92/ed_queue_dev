//package com.ed.queue.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.Date;
//import javax.persistence.Entity;
//@Entity
//@Table(name="studenttrainingrequest_master")
//
//public class StudentTrainingRequestMaster {
//	@Id
//	@Column(name="id")
//	private Long id;
//	@Column(name="institution_name")
//	private int institutionName ;
//	@Column(name="scheduled_start_date")
//	private Date scheduledStartDate;
//	@Column(name="scheduled_start_time")
//	private String scheduledStartTime;
//	@Column(name="scheduled_end_time")
//	private String scheduledEndTime ;
//	@Column(name="scheduled_end_date")
//	private String scheduledEndDate ;
//	@Column(name="purpose_of_training")
//	private String purposeOfTraining;
//	@Column(name="subject")
//	private String subject;
//	@Column(name="institution_address_1")
//	private String institutionAddress1;
//	@Column(name="institution_address_2")
//	private String institutionAddress2;
//	@Column(name="institution_address_3")
//	private String institutionAddress3;
//	@Column(name="institution_representative_name")
//	private String institutionRepresentativeName;
//	@Column(name="contact_number")
//	private String contactNumber;
//	@Column(name="email_id")
//	private String emailId;
//	@Column(name="no_of_students")
//	private int noOfStudents;
//	@Column(name="document_path")
//	private String documentPath;
//	@Column(name="active_status")
//	private boolean activeStatus;
//	@Column(name="created_from_ip")
//	private String createdFromIp;
//	@Column(name="modified_from_ip")
//	private String modifiedFromIp;
//	@Column(name="ref_number")
//	private String refNumber;
//	@Column(name="created_by")
//	private int createdBy;
//	@Column(name="created_date")
//	private Date createdDate;
//	@Column(name="modified_by")
//	private int modifiedBy;
//	@Column(name="modified_date")
//	private Date modifiedDate;
//	@Column(name="version")
//	private int version;
//	@Column(name="number_of_days")
//	private int numberOfDays;
//	
//	public String getScheduledEndDate() {
//		return scheduledEndDate;
//	}
//	public void setScheduledEndDate(String scheduledEndDate) {
//		this.scheduledEndDate = scheduledEndDate;
//	}
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public int getInstitutionName() {
//		return institutionName;
//	}
//	public void setInstitutionName(int institutionName) {
//		this.institutionName = institutionName;
//	}
//	public Date getScheduledStartDate() {
//		return scheduledStartDate;
//	}
//	public void setScheduledStartDate(Date scheduledStartDate) {
//		this.scheduledStartDate = scheduledStartDate;
//	}
//	public String getScheduledStartTime() {
//		return scheduledStartTime;
//	}
//	public void setScheduledStartTime(String scheduledStartTime) {
//		this.scheduledStartTime = scheduledStartTime;
//	}
//	public String getScheduledEndTime() {
//		return scheduledEndTime;
//	}
//	public void setScheduledEndTime(String scheduledEndTime) {
//		this.scheduledEndTime = scheduledEndTime;
//	}
//	public String getPurposeOfTraining() {
//		return purposeOfTraining;
//	}
//	public void setPurposeOfTraining(String purposeOfTraining) {
//		this.purposeOfTraining = purposeOfTraining;
//	}
//	public String getSubject() {
//		return subject;
//	}
//	public void setSubject(String subject) {
//		this.subject = subject;
//	}
//	public String getInstitutionAddress1() {
//		return institutionAddress1;
//	}
//	public void setInstitutionAddress1(String institutionAddress1) {
//		this.institutionAddress1 = institutionAddress1;
//	}
//	public String getInstitutionAddress2() {
//		return institutionAddress2;
//	}
//	public void setInstitutionAddress2(String institutionAddress2) {
//		this.institutionAddress2 = institutionAddress2;
//	}
//	public String getInstitutionAddress3() {
//		return institutionAddress3;
//	}
//	public void setInstitutionAddress3(String institutionAddress3) {
//		this.institutionAddress3 = institutionAddress3;
//	}
//	public String getInstitutionRepresentativeName() {
//		return institutionRepresentativeName;
//	}
//	public void setInstitutionRepresentativeName(String institutionRepresentativeName) {
//		this.institutionRepresentativeName = institutionRepresentativeName;
//	}
//	public String getContactNumber() {
//		return contactNumber;
//	}
//	public void setContactNumber(String contactNumber) {
//		this.contactNumber = contactNumber;
//	}
//	public String getEmailId() {
//		return emailId;
//	}
//	public void setEmailId(String emailId) {
//		this.emailId = emailId;
//	}
//	public int getNoOfStudents() {
//		return noOfStudents;
//	}
//	public void setNoOfStudents(int noOfStudents) {
//		this.noOfStudents = noOfStudents;
//	}
//	public String getDocumentPath() {
//		return documentPath;
//	}
//	public void setDocumentPath(String documentPath) {
//		this.documentPath = documentPath;
//	}
//	public boolean isActiveStatus() {
//		return activeStatus;
//	}
//	public void setActiveStatus(boolean activeStatus) {
//		this.activeStatus = activeStatus;
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
//	public String getRefNumber() {
//		return refNumber;
//	}
//	public void setRefNumber(String refNumber) {
//		this.refNumber = refNumber;
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
//	public int getVersion() {
//		return version;
//	}
//	public void setVersion(int version) {
//		this.version = version;
//	}
//	public int getNumberOfDays() {
//		return numberOfDays;
//	}
//	public void setNumberOfDays(int numberOfDays) {
//		this.numberOfDays = numberOfDays;
//	}
//
//
//}
