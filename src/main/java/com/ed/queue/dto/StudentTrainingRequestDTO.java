package com.ed.queue.dto;

import java.util.Date;

import java.io.Serializable;

	public class StudentTrainingRequestDTO implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		private Long id;
		private int institutionName ;
		private Date scheduledStartDate;
		private String scheduledStartTime;
		private String scheduledEndTime ;
		private String scheduledEndDate ;
		private String purposeOfTraining;
		private String subject;
		private String institutionAddress1;
		private String institutionAddress2;
		private String institutionAddress3;
		private String institutionRepresentativeName;
		private String contactNumber;
		private String emailId;
		private int noOfStudents;
		private String documentPath;
		private boolean activeStatus;
		private String createdFromIp;
		private String modifiedFromIp;
		private String refNumber;
		private int createdBy;
		private Date createdDate;
		private int modifiedBy;
		private Date modifiedDate;
		private int version;
		private int numberOfDays;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public int getInstitutionName() {
			return institutionName;
		}
		public void setInstitutionName(int institutionName) {
			this.institutionName = institutionName;
		}
		public Date getScheduledStartDate() {
			return scheduledStartDate;
		}
		public void setScheduledStartDate(Date scheduledStartDate) {
			this.scheduledStartDate = scheduledStartDate;
		}
		public String getScheduledStartTime() {
			return scheduledStartTime;
		}
		public void setScheduledStartTime(String scheduledStartTime) {
			this.scheduledStartTime = scheduledStartTime;
		}
		public String getScheduledEndTime() {
			return scheduledEndTime;
		}
		public void setScheduledEndTime(String scheduledEndTime) {
			this.scheduledEndTime = scheduledEndTime;
		}
		public String getScheduledEndDate() {
			return scheduledEndDate;
		}
		public void setScheduledEndDate(String scheduledEndDate) {
			this.scheduledEndDate = scheduledEndDate;
		}
		public String getPurposeOfTraining() {
			return purposeOfTraining;
		}
		public void setPurposeOfTraining(String purposeOfTraining) {
			this.purposeOfTraining = purposeOfTraining;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getInstitutionAddress1() {
			return institutionAddress1;
		}
		public void setInstitutionAddress1(String institutionAddress1) {
			this.institutionAddress1 = institutionAddress1;
		}
		public String getInstitutionAddress2() {
			return institutionAddress2;
		}
		public void setInstitutionAddress2(String institutionAddress2) {
			this.institutionAddress2 = institutionAddress2;
		}
		public String getInstitutionAddress3() {
			return institutionAddress3;
		}
		public void setInstitutionAddress3(String institutionAddress3) {
			this.institutionAddress3 = institutionAddress3;
		}
		public String getInstitutionRepresentativeName() {
			return institutionRepresentativeName;
		}
		public void setInstitutionRepresentativeName(String institutionRepresentativeName) {
			this.institutionRepresentativeName = institutionRepresentativeName;
		}
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public int getNoOfStudents() {
			return noOfStudents;
		}
		public void setNoOfStudents(int noOfStudents) {
			this.noOfStudents = noOfStudents;
		}
		public String getDocumentPath() {
			return documentPath;
		}
		public void setDocumentPath(String documentPath) {
			this.documentPath = documentPath;
		}
		public boolean getActiveStatus() {
			return activeStatus;
		}
		public void setActiveStatus(boolean activeStatus) {
			this.activeStatus = activeStatus;
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
		public String getRefNumber() {
			return refNumber;
		}
		public void setRefNumber(String refNumber) {
			this.refNumber = refNumber;
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
		public int getVersion() {
			return version;
		}
		public void setVersion(int version) {
			this.version = version;
		}
		public int getNumberOfDays() {
			return numberOfDays;
		}
		public void setNumberOfDays(int numberOfDays) {
			this.numberOfDays = numberOfDays;
		}
		@Override
		public String toString() {
			return "StudentTrainingRequestDTO [id=" + id + ", institutionName=" + institutionName
					+ ", scheduledStartDate=" + scheduledStartDate + ", scheduledStartTime=" + scheduledStartTime
					+ ", scheduledEndTime=" + scheduledEndTime + ", scheduledEndDate=" + scheduledEndDate
					+ ", purposeOfTraining=" + purposeOfTraining + ", subject=" + subject + ", institutionAddress1="
					+ institutionAddress1 + ", institutionAddress2=" + institutionAddress2 + ", institutionAddress3="
					+ institutionAddress3 + ", institutionRepresentativeName=" + institutionRepresentativeName
					+ ", contactNumber=" + contactNumber + ", emailId=" + emailId + ", noOfStudents=" + noOfStudents
					+ ", documentPath=" + documentPath + ", activeStatus=" + activeStatus + ", createdFromIp="
					+ createdFromIp + ", modifiedFromIp=" + modifiedFromIp + ", refNumber=" + refNumber + ", createdBy="
					+ createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate="
					+ modifiedDate + ", version=" + version + ", numberOfDays=" + numberOfDays + "]";
		}
		
	}
