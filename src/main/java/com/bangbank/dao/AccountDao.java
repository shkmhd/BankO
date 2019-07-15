package com.bangbank.dao;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.bangbank.entity.Account;


public class AccountDao extends GenericDao{
	

	@Transactional
	public void addToDatabase(Account acc) {
		
		em.merge(acc);
	}
	
	public Account fetchById(long accNo) {
		
		return (Account)em.createQuery("select a from Account a where a.AccNo=:em").setParameter("em", accNo).getResultList(); 
	}
}
