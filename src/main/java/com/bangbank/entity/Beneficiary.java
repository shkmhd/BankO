package com.bangbank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="Beneficiary_TBL")
public class Beneficiary {
	
	@Id
	@GeneratedValue
	@Column(name = "BENEFICIARY_ID")
	private int beneficiaryId;
	@Column(name = "TITLE")
	private String title;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name ="MIDDLE_NAME")
	private String middleName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@ManyToOne
	@JoinColumn(name = "ACCOUNT_NUMBER")
	private BankAccount bankAccount;
	@Column(name = "NICK_NAME")
	private String nickName;
	public int getBeneficiaryId() {
		return beneficiaryId;
	}
	public void setBeneficiaryId(int beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
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
	public BankAccount getAccount() {
		return bankAccount;
	}
	public void setAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	@Override
	public String toString() {
		return "Beneficiary [beneficiaryId=" + beneficiaryId + ", title=" + title + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", account=" + bankAccount + ", nickName="
				+ nickName + "]";
	}
	public Beneficiary(int beneficiaryId, String title, String firstName, String middleName, String lastName,
			BankAccount bankAccount, String nickName) {
		super();
		this.beneficiaryId = beneficiaryId;
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.bankAccount = bankAccount;
		this.nickName = nickName;
	}
	public Beneficiary() {
		super();
	}
	
}
