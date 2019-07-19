package com.bangbank.service;

import org.springframework.beans.factory.annotation.Autowired;
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
		
		accdao.addToDataBase(bankAcc);
	}
}
