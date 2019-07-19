package com.bangbank.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bangbank.entity.BankAccount;
import com.bangbank.entity.BankAccountRequest;
@Repository
public class BARDao extends GenericDao {
	/*
	 * @PersistenceContext private EntityManager em;
	 */
	
	@Transactional
	public BankAccountRequest setAccountRequest(BankAccountRequest bar) {
		return (BankAccountRequest)em.merge(bar);	
	}

	@Transactional
	public void persistAccountRequest(BankAccountRequest bar) {
		
		em.persist(bar);
		 
		 
		/* System.out.println(bar.getEmailId()); */
	}
	public List<BankAccountRequest> getReqList(String condition){
		return em.createQuery("select o from BankAccountRequest  o where o.approved= :stat").setParameter("stat",condition).getResultList();
	}
	public int removeApprovedRequest() { //Returns No of Records Deleted
		return em.createQuery("delete o from BankAccountRequest o where o.approved= true").executeUpdate();
	} 
}
