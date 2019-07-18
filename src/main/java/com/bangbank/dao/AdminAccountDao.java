package com.bangbank.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bangbank.entity.AdminAccount;
import com.bangbank.entity.OnlineAccount;
@Repository
public class AdminAccountDao extends GenericDao {

	public AdminAccount fetchByUsername(String uname) {
		List<AdminAccount> results = em.createQuery("select a from AdminAccount a where a.username=:uname").setParameter("uname", uname).getResultList();
		if (results.isEmpty()) {
			return null; 
		} else {
			return results.get(0);
		}
	}	
}
