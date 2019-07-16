package com.bangbank.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
	@Column(name ="ONLINE_ID")
	private int onlineAccId;
	@Column(name = "LOGIN_PASSWORD")
	private String loginPassword;
	@Column(name = "TRANSACTION_PASSWORD")
	private String TransactionPassword;
	@Column(name = "LAST_LOGIN")
	private Date lastLogin;
	
	/* @Column(name = "ACCOUNT_NUMBER") */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ACCOUNT_NUMBER")
	private Account account;


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


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public OnlineAccount(int onlineAccId, String loginPassword, String transactionPassword, Date lastLogin) {
		super();
		this.onlineAccId = onlineAccId;
		this.loginPassword = loginPassword;
		TransactionPassword = transactionPassword;
		this.lastLogin = lastLogin;
	}


	public OnlineAccount() {
		super();
	}
	
	

	
	

}
