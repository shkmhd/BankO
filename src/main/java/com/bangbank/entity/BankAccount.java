package com.bangbank.entity;

import java.util.Date;
import java.util.List;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "TBL_BANK_ACCOUNT")
public class BankAccount {

	@Id
	/* @GeneratedValue */
	@GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(
      name = "sequence-generator",
      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
      parameters = {
        @Parameter(name = "sequence_name", value = "user_sequence"),
        @Parameter(name = "initial_value", value = "10000000"),
        @Parameter(name = "increment_size", value = "12"),
        @Parameter(name = "allocationSize", value = "23")
        }
    )
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
	@Temporal(TemporalType.DATE)
	private Date DOB;
	@Column(name = "RESIDENTIAL_ADDRESS_ID")
	private Integer residentialAddressid;
	@Column(name = "PERMENANT_ADDRESS_ID")
	private Integer permenantAddressid;
	@Column(name = "OCCUPATION")
	private String occupation;
	@Column(name = "BALANCE")
	private double balance;
	@OneToOne(mappedBy = "bankAccount")
	private OnlineAccount oa;
	@OneToMany(mappedBy = "bankAccount")
	private List<Beneficiary> lob;
	public long getAccnumber() {
		return accnumber;
	}
	public void setAccnumber(long accnumber) {
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
	public Integer getResidentialAddressid() {
		return residentialAddressid;
	}
	public void setResidentialAddressid(Integer residentialAddressid) {
		this.residentialAddressid = residentialAddressid;
	}
	public Integer getPermenantAddressid() {
		return permenantAddressid;
	}
	public void setPermenantAddressid(Integer permenantAddressid) {
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
	public OnlineAccount getOa() {
		return oa;
	}
	public void setOa(OnlineAccount oa) {
		this.oa = oa;
	}
	public BankAccount(long accnumber, String title, String firstName, String middleName, String lastName,
			String fatherName, long mobileNo, String emailId, long aadharCardNo, Date dOB,
			Integer residentialAddressid, Integer permenantAddressid, String occupation, double balance,
			OnlineAccount oa) {
		super();
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
		this.oa = oa;
	}
	public BankAccount() {
		super();
	}
	@Override
	public String toString() {
		return "BankAccount [accnumber=" + accnumber + ", title=" + title + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", fatherName=" + fatherName
				+ ", mobileNo=" + mobileNo + ", emailId=" + emailId + ", aadharCardNo=" + aadharCardNo + ", DOB="
				+ DOB + ", residentialAddressid=" + residentialAddressid + ", permenantAddressid="
				+ permenantAddressid + ", occupation=" + occupation + ", balance=" + balance + ", oa=" + oa + "]";
	}


}



