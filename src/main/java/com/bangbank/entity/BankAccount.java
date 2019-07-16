package com.bangbank.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

	@Entity
	@Table(name = "TBL_BANK_ACCOUNT")
	public class BankAccount {
		
		@Id
		@GeneratedValue
		@Column(name = "ACCOUNT_NUMBER")
		private long accnumber;
		@Column(name = "TITLE")
		private String title;
		@Column(name = "FIRST_NAME")
		private String firstName;
		@Column(name = "MIDDLE_NAME")
		private String middleName;
		@Column(name = "LAST_NAME")
		private String lastName;
		@Column(name = "FATHERS_NAME")
		private String fatherName;
		@Column(name = "MOBILE_NO")
		private long mobileNo;
		@Column(name = "EMAIL")
		private String emailId;
		@Column(name = "AADHAR_CARD_NUMBER")
		private long aadharCardNo;
		@Column(name = "DATE_OF_BIRTH")
		private Date DOB;
		@Column(name = "RESIDENTIAL_ADDRESS_ID")
		private Integer residentialAddressid;
		@Column(name = "PERMENANT_ADDRESS_ID")
		private Integer permenantAddressid;
		@Column(name = "OCCUPATION")
		private String occupation;
		@Column(name = "BALANCE")
		private double balance;
		public long getaccnumber() {
			return accnumber;
		}
		public void setAccId(long accnumber) {
			this.accnumber = accnumber;
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
		public long getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(long mobileNo) {
			this.mobileNo = mobileNo;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public long getAadharCardNo() {
			return aadharCardNo;
		}
		public void setAadharCardNo(long aadharCardNo) {
			this.aadharCardNo = aadharCardNo;
		}
		public Date getDOB() {
			return DOB;
		}
		public void setDOB(Date dOB) {
			DOB = dOB;
		}
		public int getResidentialAddressid() {
			return residentialAddressid;
		}
		public void setResidentialAddressid(int residentialAddressid) {
			this.residentialAddressid = residentialAddressid;
		}
		public int getPermenantAddressid() {
			return permenantAddressid;
		}
		public void setPermenantAddressid(int permenantAddressid) {
			this.permenantAddressid = permenantAddressid;
		}
		public String getOccupation() {
			return occupation;
		}
		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		@Override
		public String toString() {
			return "Account [accId=" + accnumber + ", title=" + title + ", firstName=" + firstName + ", middleName="
					+ middleName + ", lastName=" + lastName + ", fatherName=" + fatherName + ", mobileNo=" + mobileNo
					+ ", emailId=" + emailId + ", aadharCardNo=" + aadharCardNo + ", DOB=" + DOB + ", occupation="
					+ occupation + ", balance=" + balance + "]";
		}
		public BankAccount(long accId, String title, String firstName, String middleName, String lastName,
				String fatherName, long mobileNo, String emailId, long aadharCardNo, Date dOB, int residentialAddressid,
				int permenantAddressid, String occupation, double balance) {
			this.accnumber = accnumber;
			this.title = title;
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
			this.fatherName = fatherName;
			this.mobileNo = mobileNo;
			this.emailId = emailId;
			this.aadharCardNo = aadharCardNo;
			DOB = dOB;
			this.residentialAddressid = residentialAddressid;
			this.permenantAddressid = permenantAddressid;
			this.occupation = occupation;
			this.balance = balance;
		}
		public BankAccount() {
		}
				
	}



