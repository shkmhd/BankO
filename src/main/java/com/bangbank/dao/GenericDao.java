package com.bangbank.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

public abstract class GenericDao {

	@PersistenceContext
	public EntityManager em;
	
	@Transactional
	public <E> E addToDataBase(E obj) {
		
		return em.merge(obj);
	}
	
	/*
	 * @Transactional public List <Object> fetchByEmail(String email) {
	 * 
	 * //Write the Select Query Here and Return the List }
	 */
 	public <E> List <E> fetchAllDetails(Class <E> c) {
		
		return em.createQuery("select o from "+c.getName()+" o").getResultList();
	}
}
