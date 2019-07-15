package com.lti.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

	@Entity
	@Table
	public class Account {
		
		@Id
		@GeneratedValue
		private long accId;
		
		private String title;
		private String firstName;
		private String middleName;
		private String lastName;
		private String fatherName;
		private int mobileNo;
		private String emailId;
		private int aadharCardNo;
		private Date DOB;
		private String residentialAddress;
		private String permenantAddress;
		private int accountNumber;
		private String occupationDetails;
		
		@OneToMany
		@JoinColumn(name = "beneficiaryId")
		private Beneficiary beneficiary;

		public long getAccId() {
			return accId;
		}

		public void setAccId(long accId) {
			this.accId = accId;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getMiddleName() {
			return middleName;
		}

		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getFatherName() {
			return fatherName;
		}

		public void setFatherName(String fatherName) {
			this.fatherName = fatherName;
		}

		public int getMobileNo() {
			return mobileNo;
		}

		public void setMobileNo(int mobileNo) {
			this.mobileNo = mobileNo;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public int getAadharCardNo() {
			return aadharCardNo;
		}

		public void setAadharCardNo(int aadharCardNo) {
			this.aadharCardNo = aadharCardNo;
		}

		public Date getDOB() {
			return DOB;
		}

		public void setDOB(Date dOB) {
			DOB = dOB;
		}

		public String getResidentialAddress() {
			return residentialAddress;
		}

		public void setResidentialAddress(String residentialAddress) {
			this.residentialAddress = residentialAddress;
		}

		public String getPermenantAddress() {
			return permenantAddress;
		}

		public void setPermenantAddress(String permenantAddress) {
			this.permenantAddress = permenantAddress;
		}

		public int getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}

		public String getOccupationDetails() {
			return occupationDetails;
		}

		public void setOccupationDetails(String occupationDetails) {
			this.occupationDetails = occupationDetails;
		}

		public Beneficiary getBeneficiary() {
			return beneficiary;
		}

		public void setBeneficiary(Beneficiary beneficiary) {
			this.beneficiary = beneficiary;
		}

		@Override
		public String toString() {
			return "Account [accId=" + accId + ", title=" + title + ", firstName=" + firstName + ", middleName="
					+ middleName + ", lastName=" + lastName + ", fatherName=" + fatherName + ", mobileNo=" + mobileNo
					+ ", emailId=" + emailId + ", aadharCardNo=" + aadharCardNo + ", DOB=" + DOB
					+ ", residentialAddress=" + residentialAddress + ", permenantAddress=" + permenantAddress
					+ ", accountNumber=" + accountNumber + ", occupationDetails=" + occupationDetails + ", beneficiary="
					+ beneficiary + ", getAccId()=" + getAccId() + ", getTitle()=" + getTitle() + ", getFirstName()="
					+ getFirstName() + ", getMiddleName()=" + getMiddleName() + ", getLastName()=" + getLastName()
					+ ", getFatherName()=" + getFatherName() + ", getMobileNo()=" + getMobileNo() + ", getEmailId()="
					+ getEmailId() + ", getAadharCardNo()=" + getAadharCardNo() + ", getDOB()=" + getDOB()
					+ ", getResidentialAddress()=" + getResidentialAddress() + ", getPermenantAddress()="
					+ getPermenantAddress() + ", getAccountNumber()=" + getAccountNumber() + ", getOccupationDetails()="
					+ getOccupationDetails() + ", getBeneficiary()=" + getBeneficiary() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}

		public Account(long accId, String title, String firstName, String middleName, String lastName,
				String fatherName, int mobileNo, String emailId, int aadharCardNo, Date dOB, String residentialAddress,
				String permenantAddress, int accountNumber, String occupationDetails, Beneficiary beneficiary) {
			super();
			this.accId = accId;
			this.title = title;
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
			this.fatherName = fatherName;
			this.mobileNo = mobileNo;
			this.emailId = emailId;
			this.aadharCardNo = aadharCardNo;
			DOB = dOB;
			this.residentialAddress = residentialAddress;
			this.permenantAddress = permenantAddress;
			this.accountNumber = accountNumber;
			this.occupationDetails = occupationDetails;
			this.beneficiary = beneficiary;
		}

		public Account() {
			super();
		}
		
		
		
		
	}



