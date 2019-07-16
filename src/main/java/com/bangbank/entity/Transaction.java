package com.bangbank.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bangbank.dto.TransactionDTO;

@Entity
@Table(name = "TBL_TRANSACTION")
public class Transaction {

	@Id
	@GeneratedValue
	private int transactionId;
	/* @Column(name = "FROM_ACCOUNT_NUMBER") */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ACCOUNT_NUMBER")
	private BankAccount frmAcc;
	@Column(name = "TO_ACCOUNT_NUMBER")
	private long toAccNo;
	@Column(name = "AMOUNT")
	private double amt;
	@Column(name = "TRANSACTION_DATE")
	private Date trnDate;
	@Column(name = "TRANSACTION_MODE")
	private String mode;
	@Column(name = "TRANSACTION_REMARKS")
	private String remarks;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public BankAccount getFrmAcc() {
		return frmAcc;
	}
	public void setFrmAcc(BankAccount frmAcc) {
		this.frmAcc = frmAcc;
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
		return "Transaction [transactionId=" + transactionId + ", frmAcc=" + frmAcc + ", toAccNo=" + toAccNo + ", amt="
				+ amt + ", trnDate=" + trnDate + ", mode=" + mode + ", remarks=" + remarks + "]";
	}
	public Transaction(int transactionId, BankAccount frmAcc, long toAccNo, double amt, Date trnDate, String mode,
			String remarks) {
		
		this.transactionId = transactionId;
		this.frmAcc = frmAcc;
		this.toAccNo = toAccNo;
		this.amt = amt;
		this.trnDate = trnDate;
		this.mode = mode;
		this.remarks = remarks;
	}
	public Transaction(BankAccount frmAcc, long toAccNo, double amt, Date trnDate, String mode,
			String remarks) {
		this.frmAcc = frmAcc;
		this.toAccNo = toAccNo;
		this.amt = amt;
		this.trnDate = trnDate;
		this.mode = mode;
		this.remarks = remarks;
	}
	public Transaction() {
	}
	public Transaction(TransactionDTO td,BankAccount frmAcc) {
		this(frmAcc,td.getToAccNo(),td.getAmt(),td.getTrnDate(),td.getMode(),td.getRemarks());
	}
	
	
	
}
