package com.bangbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.bangbank.dao.AccountDao;
import com.bangbank.dao.BARDao;
import com.bangbank.dto.AccountDTO;
import com.bangbank.entity.BankAccount;
import com.bangbank.entity.BankAccountRequest;

@Service
public class AdminApprovalService {

	@Autowired
	private BARDao barDao;
	@Autowired
	private AccountDao accdao;
	@Autowired
	private MailSender mailSender;
	
	private BankAccount bankAcc=new BankAccount();
	
	public void addToBankAccount(AccountDTO accDto) {
		
		
		BankAccountRequest  bankAccReq= barDao.fetchById(accDto.getBARid());
		
		System.out.println(bankAccReq);
		
		bankAcc.setTitle(bankAccReq.getTitle());
		bankAcc.setFirstName(bankAccReq.getFirstName());
		bankAcc.setMiddleName(bankAccReq.getMiddleName());
		bankAcc.setLastName(bankAccReq.getLastName());
		bankAcc.setFatherName(bankAccReq.getFatherName());
		bankAcc.setMobileNo(bankAccReq.getMobileNo());
		bankAcc.setEmailId(bankAccReq.getEmailId());
		bankAcc.setAadharCardNo(bankAccReq.getAadharCardNo());
		bankAcc.setDOB(bankAccReq.getDOB());
		bankAcc.setResidentialAddressid(bankAccReq.getResidentialAddress());
		bankAcc.setPermenantAddressid(bankAccReq.getPermenantAddress());
		bankAcc.setOccupation(bankAccReq.getOccupation());
		
		bankAccReq.setApproved("true");
		
		barDao.setAccountRequest(bankAccReq);
		
		barDao.removeApprovedRequest();
		
		BankAccount nbacc=accdao.addToDataBase(bankAcc);
		String email =nbacc.getEmailId();
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("Rubina.Z@lntinfotech.com");
		message.setTo(email);
		message.setSubject("Regd. Your Bank Account Request");
		message.setText("Dear Customer,"+System.getProperty("line.separator")+ " Congrats!"+System.getProperty("line.separator")+"Your Application for a Bank Account at BangBank has been accepted."+System.getProperty("line.separator")+"Your New Account Number is :"+nbacc.getAccnumber()+System.getProperty("line.separator")+"Thank You for Banking with us!");
		mailSender.send(message);
		
	}
}
