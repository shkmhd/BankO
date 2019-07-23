package com.bangbank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bangbank.dao.TransactionDao;
import com.bangbank.dto.TransactionDTO;
import com.bangbank.entity.BankAccount;
import com.bangbank.entity.Transaction;
import com.bangbank.dao.AccountDao;



@Service
public class BankTransactionService {

	/*
	 * @Autowired private TransactionDao txnDao;
	 */
	@Autowired
	TransactionDao txnDao;

	/*
	 * @Autowired private AccountDao accDao;
	 */
	@Autowired
	private AccountDao accDao;

	public TransactionDTO transfer(TransactionDTO transaction,String TransactionMode) {	



		Long frmaccno = transaction.getFrmAccNo();
		Long toaccno=transaction.getToAccNo();
		BankAccount acc1 = accDao.fetchById(frmaccno);
		BankAccount acc2 = accDao.fetchById(toaccno);
		/* System.out.println("............" + acc2); */
		if(transaction.getAmt() > acc1.getBalance()) {

			System.out.println("Sorry!No Sufficient Funds are available");
			transaction.setTrnStat("failed");
			return transaction;

		}

		else
		{
			acc1.setBalance(acc1.getBalance() - transaction.getAmt());
			acc2.setBalance(acc2.getBalance() + transaction.getAmt());

			accDao.addToDataBase(acc1);
			accDao.addToDataBase(acc2);

			transaction.setMode(TransactionMode);
			Transaction dbtxn=new Transaction(transaction,acc1);
			Transaction dbtxnreturned=txnDao.addToDataBase(dbtxn);
			transaction.setTransactionID(dbtxnreturned.getTransactionId());
			transaction.setTrnStat("Succesful");
			return transaction;


		}


	}

}
