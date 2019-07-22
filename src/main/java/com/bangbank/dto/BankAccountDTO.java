package com.bangbank.dto;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Convert;


import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BankAccountDTO {
	
	private String title;
    private String firstName;
	private String middleName;
	private String lastName;
	private String fatherName;
	private long mobileNo;
	private String emailId;
	private int aadharCardNo;
	
	//Residential Address
	private String resAddrLine1;
	private String resAddrLine2;
	private String resLandMark;
	private String resState;
	private String resCity;
	private Integer resPinCode;
	
	//Permanent Address
	private String perAddrLine1;
	private String perAddrLine2;
	private String perLandMark;
	private String perState;
	private String perCity;
	private Integer perPinCode;
	
	private String checkBox;
	
	private String occType;
		
	private MultipartFile aadharCard;
	
	
	  public Integer getResPinCode() {
		return resPinCode;
	}
	public void setResPinCode(Integer resPinCode) {
		this.resPinCode = resPinCode;
	}
	public Integer getPerPinCode() {
		return perPinCode;
	}
	public void setPerPinCode(Integer perPinCode) {
		this.perPinCode = perPinCode;
	}
	//@JsonFormat(locale = "hu", shape = JsonFormat.Shape.STRING, pattern =  "yyyy-MM-dd") 
	  private String DOB;
	
	
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

	/*
	 * public void setResPinCode(Integer resPinCode) { this.resPinCode = resPinCode;
	 * } public void setPerPinCode(Integer perPinCode) { this.perPinCode =
	 * perPinCode;
	 */
	/* } */
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
	public int getAadharCardNo() {
		return aadharCardNo;
	}
	public void setAadharCardNo(int aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}
	public String getResAddrLine1() {
		return resAddrLine1;
	}
	public void setResAddrLine1(String resAddrLine1) {
		this.resAddrLine1 = resAddrLine1;
	}
	public String getResAddrLine2() {
		return resAddrLine2;
	}
	public void setResAddrLine2(String resAddrLine2) {
		this.resAddrLine2 = resAddrLine2;
	}
	public String getResState() {
		return resState;
	}
	public void setResState(String resState) {
		this.resState = resState;
	}
	public String getResCity() {
		return resCity;
	}
	public void setResCity(String resCity) {
		this.resCity = resCity;
	}

	/*
	 * public int getResPinCode() { return resPinCode; } public void
	 * setResPinCode(int resPinCode) { this.resPinCode = resPinCode; }
	 */
	public String getPerAddrLine1() {
		return perAddrLine1;
	}
	public void setPerAddrLine1(String perAddrLine1) {
		this.perAddrLine1 = perAddrLine1;
	}
	public String getPerAddrLine2() {
		return perAddrLine2;
	}
	public void setPerAddrLine2(String perAddrLine2) {
		this.perAddrLine2 = perAddrLine2;
	}
	public String getPerState() {
		return perState;
	}
	public void setPerState(String perState) {
		this.perState = perState;
	}
	public String getPerCity() {
		return perCity;
	}
	public void setPerCity(String perCity) {
		this.perCity = perCity;
	}

	/*
	 * public int getPerPinCode() { return perPinCode; } public void
	 * setPerPinCode(int perPinCode) { this.perPinCode = perPinCode; }
	 */
	public String getResLandMark() {
		return resLandMark;
	}
	public void setResLandMark(String resLandMark) {
		this.resLandMark = resLandMark;
	}
	public String getPerLandMark() {
		return perLandMark;
	}
	public void setPerLandMark(String perLandMark) {
		this.perLandMark = perLandMark;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getOccType() {
		return occType;
	}
	public void setOccType(String occType) {
		this.occType = occType;
	}
	public MultipartFile getAadharCard() {
		return aadharCard;
	}	
	public void setAadharCard(MultipartFile aadharCard) {
		this.aadharCard = aadharCard;
	}
	public String getCheckBox() {
		return checkBox;
	}
	public void setCheckBox(String checkBox) {
		this.checkBox = checkBox;
	}
}
