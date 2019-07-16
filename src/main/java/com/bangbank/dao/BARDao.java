package com.bangbank.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.bangbank.entity.BankAccount;
import com.bangbank.entity.BankAccountRequest;

public class BARDao extends GenericDao {
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public BankAccountRequest setAccountRequest(BankAccountRequest bar) {
		return (BankAccountRequest)em.merge(bar);	
	}
	public List<BankAccountRequest> getReqList(String condition){
		return em.createQuery("select o from BankAccountRequest  o where o.approved= :stat").setParameter("stat",condition).getResultList();
	}
	public int removeApprovedRequest() { //Returns No of Records Deleted
		return em.createQuery("delete o from BankAccountRequest o where o.approved= true").executeUpdate();
	} 
}
