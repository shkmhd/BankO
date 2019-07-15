package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "")
public class Address {

	@Id
	@GeneratedValue
	private int residentialAddrId;
	 
	private String address1;
	private String address2;
	private String landMark;
	private String state;
	private String city;
	private int pinCode;
	public int getResidentialAddrId() {
		return residentialAddrId;
	}
	public void setResidentialAddrId(int residentialAddrId) {
		this.residentialAddrId = residentialAddrId;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [residentialAddrId=" + residentialAddrId + ", address1=" + address1 + ", address2=" + address2
				+ ", landMark=" + landMark + ", state=" + state + ", city=" + city + ", pinCode=" + pinCode
				+ ", getResidentialAddrId()=" + getResidentialAddrId() + ", getAddress1()=" + getAddress1()
				+ ", getAddress2()=" + getAddress2() + ", getLandMark()=" + getLandMark() + ", getState()=" + getState()
				+ ", getCity()=" + getCity() + ", getPinCode()=" + getPinCode() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Address(int residentialAddrId, String address1, String address2, String landMark, String state, String city,
			int pinCode) {
		super();
		this.residentialAddrId = residentialAddrId;
		this.address1 = address1;
		this.address2 = address2;
		this.landMark = landMark;
		this.state = state;
		this.city = city;
		this.pinCode = pinCode;
	}
	public Address() {
		super();
	}
	
	
}
