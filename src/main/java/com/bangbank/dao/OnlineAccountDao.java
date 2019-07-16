package com.bangbank.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.bangbank.entity.OnlineAccount;


@Repository
public class OnlineAccountDao extends GenericDao  {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public OnlineAccount fetchOA(long accNo) {
		
		OnlineAccount oa =  (OnlineAccount)entityManager.createQuery
									 ("select a from OnlineAccount a where a.bankAccount.accnumber= :em").setParameter("em", accNo)
									 .getSingleResult();
		return oa;
	}

}
