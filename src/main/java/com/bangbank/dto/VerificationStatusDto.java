package com.bangbank.dto;

public class VerificationStatusDto {
	private String stat;
	private long loggedInAccNo;
	

	public long getLoggedInAccNo() {
		return loggedInAccNo;
	}

	public void setLoggedInAccNo(long loggedInAccNo) {
		this.loggedInAccNo = loggedInAccNo;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public VerificationStatusDto(String stat, long loggedInAccNo) {
		super();
		this.stat = stat;
		this.loggedInAccNo = loggedInAccNo;
	}
	public VerificationStatusDto(String stat) {
		super();
		this.stat = stat;
		
	}

	public VerificationStatusDto() {
		super();
	}

	@Override
	public String toString() {
		return "VerificationStatusDto [stat=" + stat + ", loggedInAccNo=" + loggedInAccNo + "]";
	}

	


	
}
