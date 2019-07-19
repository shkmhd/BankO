package com.bangbank.dto;

import java.util.Date;

import com.bangbank.entity.BankAccount;
import com.bangbank.entity.Transaction;
import com.fasterxml.jackson.annotation.JsonFormat;

public class TransactionDTO {

	public int getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	public void setFrmAccNo(long frmAccNo) {
		this.frmAccNo = frmAccNo;
	}
	private String trnStat;
	public String getTrnStat() {
		return trnStat;
	}
	public void setTrnStat(String trnStat) {
		this.trnStat = trnStat;
	}
	private int transactionID;
	
	private long frmAccNo;

	private long toAccNo;

	private double amt;
	@JsonFormat(locale = "hu", shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date trnDate;
	@JsonFormat(locale = "hu", shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date fromDate;
	@JsonFormat(locale = "hu", shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date endDate;
	private String mode;

	private String remarks;

	private String matInst;


	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getMatInst() {
		return matInst;
	}
	public void setMatInst(String matInst) {
		this.matInst = matInst;
	}
	public long getFrmAccNo() {
		return frmAccNo;
	}
	public void setFrmAccNo(Long frmAccNo) {
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
		return "TransactionDTO [frmAccNo=" + frmAccNo + ", toAccNo=" + toAccNo + ", amt=" + amt + ", trnDate=" + trnDate
				+ ", mode=" + mode + ", remarks=" + remarks + ", matInst=" + matInst + "]";
	}
	public TransactionDTO(int transactionId, long frmAccNo, long toAccNo, double amt, Date trnDate, String mode,
			String remarks,String matInst) {


		this.frmAccNo = frmAccNo;
		this.toAccNo = toAccNo;
		this.amt = amt;
		this.trnDate = trnDate;
		this.mode = mode;
		this.remarks = remarks;
		this.matInst=matInst;
	}

	public TransactionDTO(Transaction txn) {
		this(txn.getTransactionId(),txn.getFrmAcc().getAccnumber(),txn.getToAccNo(),txn.getAmt(),txn.getTrnDate(),txn.getMode(),txn.getRemarks(),txn.getMatInst());
	}
	public TransactionDTO() {
		super();
	}

}
