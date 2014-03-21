package com.annuaire.dao;

import javax.persistence.EntityTransaction;

import common.Expert;

public class ExpertDAOImpl extends GenericDAOImpl<Expert, Integer> implements ExpertDAO {

	public Expert getExpert(int id) {
		getEM();
		EntityTransaction tx = this.em.getTransaction();
		Expert exp = null;
		try {
			tx.begin();
			exp = this.em.find(Expert.class, id);
//			Query query = em.createQuery("SELECT e FROM Expert e");
//			List<Expert> exps =  query.getResultList();
			tx.commit();
		} catch (Throwable t) {
			t.printStackTrace();
			tx.rollback();	
		}
		return exp;
	}
	

}
