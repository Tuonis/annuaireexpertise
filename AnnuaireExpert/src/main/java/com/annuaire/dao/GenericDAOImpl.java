package com.annuaire.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GenericDAOImpl<TYPE, KEY> implements GenericDAO<TYPE, KEY> {

	protected EntityManager em;

	public boolean create(TYPE object) {
		getEM();
		boolean transactionOk = true;
		EntityTransaction tx = this.em.getTransaction();
		try {
			tx.begin();
			this.em.persist(object);
			tx.commit();
		} catch (Throwable t) {
			tx.rollback();
			transactionOk = false;
		}
		return transactionOk;
	}

	public boolean update(TYPE object) {
		getEM();
		boolean transactionOk = true;
		EntityTransaction tx = this.em.getTransaction();
		try {
			tx.begin();
			this.em.merge(object);
			tx.commit();
		} catch (Throwable t) {
			tx.rollback();
			transactionOk = false;
		}
		return transactionOk;
	}

	public boolean delete(TYPE object) {
		getEM();
		boolean transactionOk = true;
		EntityTransaction tx = this.em.getTransaction();
		try {
			tx.begin();
//			Query q = em.createQuery("DELETE e FROM Experts as e WHERE e.Numero = :id");
//			q.setParameter("id", id);
//			int i = q.executeUpdate();
			em.remove(object);
			tx.commit();
		} catch (Throwable t) {
			t.printStackTrace();
			tx.rollback();
			transactionOk = false;
		}
		return transactionOk;
	}

	public void getEM() {

		if (this.em == null) {
			EntityManagerFactory emf = Persistence
					.createEntityManagerFactory("annuaire");
			this.em = emf.createEntityManager();
		}

	}

}
