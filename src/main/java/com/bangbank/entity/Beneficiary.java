package com.bangbank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

import com.bangbank.dto.BeneficiaryDTO;

@Entity
@Table(name="TBL_BENEFICIARY")
public class Beneficiary {
	
	@Id
	@GeneratedValue
	@Column(name = "BENEFICIARY_ID")
	private int beneficiaryId;
	@Column(name = "BENEFICIARY_ACC_NO")
	private Long beneficiaryaccno;
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
	public Long getBeneficiaryaccno() {
		return beneficiaryaccno;
	}
	public void setBeneficiaryaccno(Long beneficiaryaccno) {
		this.beneficiaryaccno = beneficiaryaccno;
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
	public BankAccount getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Beneficiary(int beneficiaryId, Long beneficiaryaccno, String title, String firstName, String middleName,
			String lastName, BankAccount bankAccount, String nickName) {
		this.beneficiaryId = beneficiaryId;
		this.beneficiaryaccno = beneficiaryaccno;
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.bankAccount = bankAccount;
		this.nickName = nickName;
	}
	public Beneficiary() {
	}
	
	
}
