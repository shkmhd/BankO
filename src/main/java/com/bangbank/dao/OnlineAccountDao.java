package com.bangbank.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.bangbank.entity.AdminAccount;
import com.bangbank.entity.OnlineAccount;


@Repository
public class OnlineAccountDao extends GenericDao  {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public OnlineAccount fetchOA(long accNo) {
		
		List<OnlineAccount> results = em.createQuery("select oa from OnlineAccount oa where oa.bankAccount.accnumber= :em").setParameter("em", accNo).getResultList();
		if (results.isEmpty()) {
			return null; 
		} else {
			return results.get(0);
		}
		 //("select oa from BankAccount a inner join a.oa oa where a.accnumber= :em").setParameter("em", accNo)
		/*
		 * System.out.println("password is:" +oa.getLoginPassword());
		 * System.out.println("======> " + accNo);
		 */
	
	}

}
