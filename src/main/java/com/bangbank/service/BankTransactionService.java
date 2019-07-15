package com.bangbank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.AccountDao;
import com.lti.dao.TransactionDao;
import com.lti.entity.Account;
import com.lti.entity.Transaction;

@Service
public class BankTransactionService {

	@Autowired
	private TransactionDao txnDao;
	
	@Autowired
	private AccountDao accDao; 
	@Transactional
	public boolean transfer(Transaction transaction,String TransactionMode) {	
		
		
	
		Account acc1 = accDao.fetchById(transaction.getFrmAccNo());
		Account acc2 = accDao.fetchById(transaction.getToAccNo());
		
		if(transaction.getAmt() < acc1.getBalance()) {
			
		acc1.setBalance(acc1.getBalance() - transaction.getAmt());
		acc2.setBalance(acc2.getBalance() + transaction.getAmt());
		
		System.out.println("Transaction Successful");
		
		accDao.addToDataBase(acc1);
		accDao.addToDataBase(acc2);
		
		transaction.setMode(TransactionMode);
		
		txnDao.addToDataBase(transaction);
		
		return true;
		}
		
		else
			{
			System.out.println("Sorry!No Sufficient Funds are available");
			return false;
			}
		
		
	}
	
}
