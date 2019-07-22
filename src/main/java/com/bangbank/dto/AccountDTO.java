package com.bangbank.dto;

import java.util.Date;

import javax.persistence.Column;

import com.bangbank.entity.BankAccountRequest;
import com.fasterxml.jackson.annotation.JsonFormat;

public class AccountDTO {

	private long accId;
	private int BARid;
	private String title;
	private String firstName;
	private String middleName;
	private String lastName;
	private String fatherName;
	private long mobileNo;
	private String emailId;
	private long aadharCardNo;
	
	@JsonFormat(locale = "hu", shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dob;
	
	private Integer residentialAddress;
	private Integer permenantAddress;
	private String occupation;
	private String approved;
	
	private double balance;
	private String accType;
	
	private String aadharCardFilePath;
	
	
	public int getBARid() {
		return BARid;
	}

	public void setBARid(int bARid) {
		this.BARid = bARid;
	}

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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Integer getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(Integer residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public Integer getPermenantAddress() {
		return permenantAddress;
	}

	public void setPermenantAddress(Integer permenantAddress) {
		this.permenantAddress = permenantAddress;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
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
	

	public String getAadharCardFilePath() {
		return aadharCardFilePath;
	}

	public void setAadharCardFilePath(String aadharCardFilePath) {
		this.aadharCardFilePath = aadharCardFilePath;
	}

	@Override
	public String toString() {
		return "AccountDTO [accId=" + accId + ", BARid=" + BARid + ", title=" + title + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", fatherName=" + fatherName + ", mobileNo="
				+ mobileNo + ", emailId=" + emailId + ", aadharCardNo=" + aadharCardNo + ", dob=" + dob
				+ ", residentialAddress=" + residentialAddress + ", permenantAddress=" + permenantAddress
				+ ", occupation=" + occupation + ", approved=" + approved + ", balance=" + balance + ", accType="
				+ accType + "]";
	}
	
	public AccountDTO(long accId, int BARid, String title, String firstName, String middleName, String lastName,
			String fatherName, long mobileNo, String emailId, long aadharCardNo, Date dob, int residentialAddress,
			int permenantAddress, String occupation, String approved, double balance, String accType) {
		
		super();
		this.accId = accId;
		this.BARid = BARid;
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.aadharCardNo = aadharCardNo;
		this.dob = dob;
		this.residentialAddress = residentialAddress;
		this.permenantAddress = permenantAddress;
		this.occupation = occupation;
		this.approved = approved;
		this.balance = balance;
		this.accType = accType;
	}
	
	public AccountDTO(BankAccountRequest bar) {
		
		this.BARid = bar.getBARid();
		this.title = bar.getTitle();
		this.firstName = bar.getFirstName();
		this.middleName = bar.getMiddleName();
		this.lastName = bar.getLastName();
		this.fatherName = bar.getFatherName();
		this.mobileNo = bar.getMobileNo();
		this.emailId = bar.getEmailId();
		this.aadharCardNo = bar.getAadharCardNo();
		this.dob = bar.getDOB();
		this.residentialAddress = bar.getResidentialAddress();
		this.permenantAddress =  bar.getPermenantAddress();
		this.occupation = bar.getOccupation();
		this.approved = bar.getApproved();
		this.aadharCardFilePath = bar.getAadharCardFilePath();
	}
	
	public AccountDTO() {
		super();
	}
}
