package com.bangbank.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bangbank.entity.Address;

@Repository
public class AddressDao extends GenericDao{

	public List<Address> fetchByAddrId(int addrId){
		
		return em.createQuery("select addr from Address addr where addr.AddrId=:em").setParameter("em", addrId).getResultList(); 
	}
}
