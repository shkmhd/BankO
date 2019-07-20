package com.bangbank.dao;

import java.util.List;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.bangbank.entity.BankAccount;

@Repository
public class AccountDao extends GenericDao{
	

	@Transactional
	public void addToDatabase(BankAccount acc) {
		
		em.merge(acc);
	}
	
	public BankAccount fetchById(long accNo) {
		
		/* System.out.println(em); */
		Query q=em.createQuery("select a from BankAccount a where a.accnumber=:em");
		q.setParameter("em", accNo);
		List<BankAccount> ls =q.getResultList();
		if(ls.isEmpty()) {
			return null;
		}
		else
		return ls.get(0);

	}
}
