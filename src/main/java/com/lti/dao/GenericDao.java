package com.lti.dao;

import java.util.List;

public abstract class GenericDao {

	@PersistenceContext
	private EntityManager em;
	
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
