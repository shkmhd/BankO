package com.bangbank.dto;

import java.util.Date;

public class OnlineAccountDto {

	private int onlineAccId;
	private String loginPassword;
	private String TransactionPassword;
	private Date lastLogin;
	private long accno;
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
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
	@Override
	public String toString() {
		return "OnlineAccountDto [onlineAccId=" + onlineAccId + ", loginPassword=" + loginPassword
				+ ", TransactionPassword=" + TransactionPassword + ", lastLogin=" + lastLogin + "]";
	}
	public OnlineAccountDto(int onlineAccId, String loginPassword, String transactionPassword, Date lastLogin) {
		super();
		this.onlineAccId = onlineAccId;
		this.loginPassword = loginPassword;
		TransactionPassword = transactionPassword;
		this.lastLogin = lastLogin;
	}
	public OnlineAccountDto() {
		super();
	}
}
