package com.bangbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bangbank.dao.AccountDao;
import com.bangbank.dao.OnlineAccountDao;
import com.bangbank.dto.AccountDTO;
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
    	 OnlineAccount noacc=onlineAccountDao.addToDataBase(oacc);
    	 noacc.setBankAccount(accountDao.fetchById(onlineAccountDTO.getAccno()));
    	 onlineAccountDao.addToDataBase(noacc);
    	 return new VerificationStatusDto("success"); 
    	 
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
public AccountDTO getAccDetails(long accId) {
		
		BankAccount ba=accountDao.fetchById(accId);
		AccountDTO bd=new AccountDTO();
		bd.setBalance(ba.getBalance());
		bd.setFirstName(ba.getFirstName());
		return bd;
		
	}
}