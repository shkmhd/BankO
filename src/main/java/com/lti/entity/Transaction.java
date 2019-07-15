package com.lti.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transaction_TBL")
public class Transaction {

	@Id
	@GeneratedValue
	private int trnId;
	
	private long frmAccNo;
	private long toAccNo;
	private double amt;
	private Date trnDate;
	private String mode;
	private String remarks;
	/*
	 * private enum Mode{ NEFT, IMPS, RTGS }
	 */
	public int getTrnId() {
		return trnId;
	}
	public void setTrnId(int trnId) {
		this.trnId = trnId;
	}
	public long getFrmAccNo() {
		return frmAccNo;
	}
	public void setFrmAccNo(long frmAccNo) {
		this.frmAccNo = frmAccNo;
	}
	public long getToAccNo() {
		return toAccNo;
	}
	public void setToAccNo(long toAccNo) {
		this.toAccNo = toAccNo;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	public Date getTrnDate() {
		return trnDate;
	}
	public void setTrnDate(Date trnDate) {
		this.trnDate = trnDate;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Transaction [trnId=" + trnId + ", frmAccNo=" + frmAccNo + ", toAccNo=" + toAccNo + ", amt=" + amt
				+ ", trnDate=" + trnDate + ", mode=" + mode + ", remarks=" + remarks + ", getTrnId()=" + getTrnId()
				+ ", getFrmAccNo()=" + getFrmAccNo() + ", getToAccNo()=" + getToAccNo() + ", getAmt()=" + getAmt()
				+ ", getTrnDate()=" + getTrnDate() + ", getMode()=" + getMode() + ", getRemarks()=" + getRemarks()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public Transaction(int trnId, long frmAccNo, long toAccNo, double amt, Date trnDate, String mode, String remarks) {
		super();
		this.trnId = trnId;
		this.frmAccNo = frmAccNo;
		this.toAccNo = toAccNo;
		this.amt = amt;
		this.trnDate = trnDate;
		this.mode = mode;
		this.remarks = remarks;
	}
	public Transaction() {
		super();
	}
	
	
	
}
