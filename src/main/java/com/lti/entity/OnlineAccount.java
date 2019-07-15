package com.lti.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Online_Account_Table")
public class OnlineAccount {
	
	@Id
	@GeneratedValue
	private int onlineAccId;
	
	private String loginPassword;
	private String TransactionPassword;
	private Date lastLogin;
	
	
	@OneToOne
	@JoinColumn(name = "accId")
	private long accountNumber;


	public int getOnlineAccId() {
		return onlineAccId;
	}


	public void setOnlineAccId(int onlineAccId) {
		this.onlineAccId = onlineAccId;
	}


	public String getLoginPassword() {
		return loginPassword;
	}


	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}


	public String getTransactionPassword() {
		return TransactionPassword;
	}


	public void setTransactionPassword(String transactionPassword) {
		TransactionPassword = transactionPassword;
	}


	public Date getLastLogin() {
		return lastLogin;
	}


	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}


	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	@Override
	public String toString() {
		return "OnlineAccount [onlineAccId=" + onlineAccId + ", loginPassword=" + loginPassword
				+ ", TransactionPassword=" + TransactionPassword + ", lastLogin=" + lastLogin + ", accountNumber="
				+ accountNumber + ", getOnlineAccId()=" + getOnlineAccId() + ", getLoginPassword()="
				+ getLoginPassword() + ", getTransactionPassword()=" + getTransactionPassword() + ", getLastLogin()="
				+ getLastLogin() + ", getAccountNumber()=" + getAccountNumber() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public OnlineAccount(int onlineAccId, String loginPassword, String transactionPassword, Date lastLogin,
			long accountNumber) {
		super();
		this.onlineAccId = onlineAccId;
		this.loginPassword = loginPassword;
		TransactionPassword = transactionPassword;
		this.lastLogin = lastLogin;
		this.accountNumber = accountNumber;
	}


	public OnlineAccount() {
		super();
	}
	
	
	
	
	

}
