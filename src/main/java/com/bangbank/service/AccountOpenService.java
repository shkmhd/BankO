package com.bangbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bangbank.dao.AccountDao;
import com.bangbank.dao.BARDao;
import com.bangbank.dao.GenericDao;
import com.bangbank.dto.BankAccountDTO;
import com.bangbank.entity.BankAccount;
import com.bangbank.entity.BankAccountRequest;
 
@Service
public class AccountOpenService {
	
	@Autowired
	private BARDao bardao;
	
	BankAccountRequest acc=new BankAccountRequest();
	
	@Transactional
	public void accountopen(BankAccountDTO accountdto) {
		
		acc.setTitle(accountdto.getTitle());
		acc.setFirstName(accountdto.getFirstName());
		acc.setMiddleName(accountdto.getMiddleName());
		acc.setLastName(accountdto.getLastName());
		acc.setFatherName(accountdto.getFatherName());
		acc.setMobileNo(accountdto.getMobileNo());
		acc.setEmailId(accountdto.getEmailId());
		acc.setAadharCardNo(accountdto.getAadharCardNo());
		acc.setDOB(accountdto.getDOB());
		acc.setApproved("FALSE");
		//Address part
	
		/* BankAccountRequest barnew= */
		bardao.persistAccountRequest(acc);
		
		System.out.println("success");
		
	
		
	
	
	
	}

	

	
	
}
