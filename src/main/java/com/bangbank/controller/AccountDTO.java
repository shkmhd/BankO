package com.bangbank.controller;

import java.sql.Date;

import javax.persistence.Column;

public class AccountDTO {

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
	private String occupation;
	private double balance;
	private String accType;

	
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public AccountDTO(long accId, String title, String firstName, String middleName, String lastName, String fatherName,
			int mobileNo, String emailId, int aadharCardNo, Date dOB, String residentialAddress,
			String permenantAddress, String occupation, double balance, String accType) {
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
		this.occupation = occupation;
		this.balance = balance;
		this.accType = accType;
	}
	@Override
	public String toString() {
		return "AccountDTO [accId=" + accId + ", title=" + title + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", fatherName=" + fatherName + ", mobileNo=" + mobileNo
				+ ", emailId=" + emailId + ", aadharCardNo=" + aadharCardNo + ", DOB=" + DOB + ", residentialAddress="
				+ residentialAddress + ", permenantAddress=" + permenantAddress + ", occupation=" + occupation
				+ ", balance=" + balance + ", accType=" + accType + "]";
	}
	public AccountDTO() {
		super();
	}
}
