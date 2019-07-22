package com.bangbank.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bangbank.entity.AdminAccount;
import com.bangbank.entity.OnlineAccount;


@Repository
public class OnlineAccountDao extends GenericDao  {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public OnlineAccount fetchOA(long accNo) {
		
		List<OnlineAccount> results = em.createQuery("select a from OnlineAccount a where a.bankAccount.accnumber=:em").setParameter("em", accNo).getResultList();
		if (results.isEmpty()) {
			return null; 
		} else {
			return results.get(0);
		}
		
	}
	
	@Transactional
	public void persistOnlineAccount(OnlineAccount oacc) {
      
		em.persist(oacc);
		
	}

}
