package com.bangbank.entity;

import java.sql.Date;
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
	public class Account {
		
		@Id
		@GeneratedValue
		@Column(name = "ACCOUNT_NUMBER")
		private long accId;
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
		private int mobileNo;
		@Column(name = "EMAIL")
		private String emailId;
		@Column(name = "AADHAR_CARD_NUMBER")
		private int aadharCardNo;
		@Column(name = "DATE_OF_BIRTH")
		private Date DOB;
		@Column(name = "RESIDENTIAL_ADDRESS_ID")
		private String residentialAddress;
		@Column(name = "PERMENANT_ADDRESS_ID")
		private String permenantAddress;
		@Column(name = "OCCUPATION")
		private String occupation;
		
		@OneToMany(mappedBy="account",fetch=FetchType.EAGER,cascade = CascadeType.ALL)
		private Set<Beneficiary> beneficiaries;
		@OneToMany(mappedBy = "fromAcc" )
		private Set<Transaction> transactions;		
		@OneToOne
		OnlineAccount onlineacc;
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
		public String getOccupation() {
			return occupation;
		}
		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}
		public Set<Beneficiary> getBeneficiaries() {
			return beneficiaries;
		}
		public void setBeneficiaries(Set<Beneficiary> beneficiaries) {
			this.beneficiaries = beneficiaries;
		}
		public Set<Transaction> getTransactions() {
			return transactions;
		}
		public void setTransactions(Set<Transaction> transactions) {
			this.transactions = transactions;
		}
		public OnlineAccount getOnlineacc() {
			return onlineacc;
		}
		public void setOnlineacc(OnlineAccount onlineacc) {
			this.onlineacc = onlineacc;
		}
		@Override
		public String toString() {
			return "Account [accId=" + accId + ", title=" + title + ", firstName=" + firstName + ", middleName="
					+ middleName + ", lastName=" + lastName + ", fatherName=" + fatherName + ", mobileNo=" + mobileNo
					+ ", emailId=" + emailId + ", aadharCardNo=" + aadharCardNo + ", DOB=" + DOB
					+ ", residentialAddress=" + residentialAddress + ", permenantAddress=" + permenantAddress
					+ ", occupation=" + occupation + ", beneficiaries=" + beneficiaries + ", transactions="
					+ transactions + ", onlineacc=" + onlineacc + "]";
		}
		public Account(long accId, String title, String firstName, String middleName, String lastName,
				String fatherName, int mobileNo, String emailId, int aadharCardNo, Date dOB, String residentialAddress,
				String permenantAddress, String occupation, Set<Beneficiary> beneficiaries,
				Set<Transaction> transactions, OnlineAccount onlineacc) {
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
			this.occupation = occupation;
			this.beneficiaries = beneficiaries;
			this.transactions = transactions;
			this.onlineacc = onlineacc;
		}
		public Account() {
		}
		
	}



