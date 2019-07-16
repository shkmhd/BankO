package com.bangbank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_ADDRESS")
public class Address {

	@Id
	@GeneratedValue
	@Column(name = "ADDRESS_ID")
	private int AddrId;
	 @Column(name = "ADDRESS_LINE_ONE")
	private String address1;
	 @Column(name = "ADDRESS_LINE_TWO")
	private String address2;
	 @Column(name = "LANDMARK")
	private String landMark;
	 @Column(name = "STATE")
	private String state;
	 @Column(name = "CITY")
	private String city;
	 @Column(name = "PINCODE")
	private int pincode;
	public int getAddrId() {
		return AddrId;
	}
	public void setAddrId(int addrId) {
		AddrId = addrId;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [AddrId=" + AddrId + ", address1=" + address1 + ", address2=" + address2 + ", landMark="
				+ landMark + ", state=" + state + ", city=" + city + ", pincode=" + pincode + ", getAddrId()="
				+ getAddrId() + ", getAddress1()=" + getAddress1() + ", getAddress2()=" + getAddress2()
				+ ", getLandMark()=" + getLandMark() + ", getState()=" + getState() + ", getCity()=" + getCity()
				+ ", getPincode()=" + getPincode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Address(int addrId, String address1, String address2, String landMark, String state, String city,
			int pincode) {
		super();
		AddrId = addrId;
		this.address1 = address1;
		this.address2 = address2;
		this.landMark = landMark;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	
	
	
}
