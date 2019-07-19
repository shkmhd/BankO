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
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public BankAccountRequest setAccountRequest(BankAccountRequest bar) {
		
		return (BankAccountRequest)em.merge(bar);	
	}
	
	public BankAccountRequest fetchById(int barId) {
		List<BankAccountRequest>barlist=em.createQuery("select bar from BankAccountRequest bar where bar.BARid=:em").setParameter("em",barId).getResultList();
		/* System.out.println(barlist.get(0)); */
		/* System.out.println(barId); */
		System.out.println(em.createQuery("select bar from BankAccountRequest bar where bar.BARid=:em").setParameter("em",barId).getSingleResult());
		return barlist.get(0);
	}
	
	
	
	public List<BankAccountRequest> getReqList(String condition){
		return em.createQuery("select o from BankAccountRequest  o where o.approved= :stat").setParameter("stat",condition).getResultList();
	}
	@Transactional
	public int removeApprovedRequest() { //Returns No of Records Deleted
		return em.createQuery("delete from BankAccountRequest o where o.approved=:stmt").setParameter("stmt", "true").executeUpdate();
	} 
}
