package com.lti.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bank_account_table")
public class BankAccountRequest {
	
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
	private String occupationDetails;
	private String Approved;
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
	public String getOccupationDetails() {
		return occupationDetails;
	}
	public void setOccupationDetails(String occupationDetails) {
		this.occupationDetails = occupationDetails;
	}
	public String getApproved() {
		return Approved;
	}
	public void setApproved(String approved) {
		Approved = approved;
	}
	@Override
	public String toString() {
		return "BankAccountRequest [title=" + title + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", fatherName=" + fatherName + ", mobileNo=" + mobileNo + ", emailId="
				+ emailId + ", aadharCardNo=" + aadharCardNo + ", DOB=" + DOB + ", residentialAddress="
				+ residentialAddress + ", permenantAddress=" + permenantAddress + ", occupationDetails="
				+ occupationDetails + ", Approved=" + Approved + "]";
	}
	public BankAccountRequest(String title, String firstName, String middleName, String lastName, String fatherName,
			int mobileNo, String emailId, int aadharCardNo, Date dOB, String residentialAddress,
			String permenantAddress, String occupationDetails, String approved) {
		super();
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
		this.occupationDetails = occupationDetails;
		Approved = approved;
	}
	public BankAccountRequest() {
		super();
	}
	
	
	
	
		
		
	
	
	
	

}
