package com.bangbank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bangbank.controller.AccountDTO;
import com.bangbank.dao.AccountDao;
import com.bangbank.dao.TransactionDao;
import com.bangbank.dto.TransactionDTO;
import com.bangbank.entity.BankAccount;
import com.bangbank.entity.Transaction;

@Service
public class StatementService {	//Change the name

	@Autowired
	private TransactionDao transactionDao;

	public List<TransactionDTO> fullStatement(AccountDTO adto) {
		
			System.out.println("This is the Service Part");
			
			List<Transaction> txnlist= transactionDao.fetchAllTransactionsById(adto.getAccId());
			List<TransactionDTO> txndtolist=new ArrayList<TransactionDTO>();
			for(Transaction txn:txnlist) {
				TransactionDTO txndto=new TransactionDTO(txn);
				txndtolist.add(txndto);
			}
			return txndtolist;
	}
	
	public List<TransactionDTO> miniStatement(AccountDTO accDto) {
			
		List<Transaction> txnlist= transactionDao.fetchMiniStatement(accDto.getAccId());
		List<TransactionDTO> txndtolist=new ArrayList<TransactionDTO>();
		for(Transaction txn:txnlist) {
			TransactionDTO txndto=new TransactionDTO(txn);
			txndtolist.add(txndto);
		}
		return txndtolist;
		}
}
