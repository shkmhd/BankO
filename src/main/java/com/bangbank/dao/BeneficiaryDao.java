package com.bangbank.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bangbank.entity.Beneficiary;

@Repository
public class BeneficiaryDao extends GenericDao{
	public List<Beneficiary> fetchBeneficiariesOfAccountNo(long accno) {
		return em.createQuery("select a from Beneficiary a where a.bankAccount.accnumber=:an").setParameter("an", accno).getResultList();
	}
	public List<Beneficiary> fetchBeneficiaryOfAccountNoWithNickName(long accno,String nickname) {
		return em.createQuery("select a from Beneficiary a where a.bankAccount.accnumber=:an and a.nickName=:nn").setParameter("an", accno).setParameter("nn", nickname).getResultList();
	}
}
