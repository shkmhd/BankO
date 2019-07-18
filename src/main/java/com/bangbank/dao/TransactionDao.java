package com.bangbank.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bangbank.entity.Transaction;

@Repository
public class TransactionDao extends GenericDao{
	public List<Transaction> fetchAllTransactionsById(long accNo) {

		return em.createQuery("select distinct t from Transaction t inner join t.frmAcc fa where t.toAccNo=:accno or fa.accnumber=:accno")
				.setParameter("accno", accNo).getResultList();

	}

	public List<Transaction> fetchMiniStatement(long accNo) {

		return em.createQuery("select distinct t from Transaction t inner join t.frmAcc fa where t.toAccNo=:accno or fa.accnumber=:accno order by t.trnDate desc")
				.setParameter("accno", accNo).setMaxResults(5).getResultList();
	}
	/*
	 * public fetchAllDetails(Class<E> c) {
	 * 
	 * return em.createQuery("select o from "+c.getName()+" o").getResultList(); }
	 */
}
