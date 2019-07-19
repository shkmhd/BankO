package com.bangbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bangbank.dao.AccountDao;
import com.bangbank.dao.OnlineAccountDao;

import com.bangbank.dto.OnlineAccountDto;
import com.bangbank.dto.VerificationStatusDto;
import com.bangbank.entity.BankAccount;
import com.bangbank.entity.OnlineAccount;
@Service
public class OnlineAccountService {
	
	@Autowired
	private OnlineAccountDao onlineAccountDao;
	@Autowired
	private AccountDao accountDao;
	
     @Transactional
	 public VerificationStatusDto onlinebankingreg(OnlineAccountDto onlineAccountDTO) {
    	 OnlineAccount oacc=new OnlineAccount();
    	 oacc.setOnlineAccId(onlineAccountDTO.getOnlineAccId());
    	 oacc.setLoginPassword(onlineAccountDTO.getLoginPassword());
    	 oacc.setTransactionPassword(onlineAccountDTO.getTransactionPassword());
    	 oacc.setLastLogin(onlineAccountDTO.getLastLogin());
    	 onlineAccountDao.addToDataBase(oacc);
    	
    	 return new VerificationStatusDto("Success");
    	 

    	 
    	 
	}


	public VerificationStatusDto accountcheck(long accno) {
		
		/* BankAccount ba=accountDao.fetchById(accno); */
		
		if(accountDao.fetchById(accno)==(null))
		{
		
		return new VerificationStatusDto("You do not have an Account with us!"
				+ "  Would you like to open a new Account?");
		}
		else 
			{
	
			return new VerificationStatusDto("success");
			}
}
}