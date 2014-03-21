package com.annuaire.service;

import com.annuaire.dao.ExpertDAO;
import com.annuaire.dao.ExpertDAOImpl;

import common.Expert;

public class ExpertService {

	private ExpertDAO expertDAO;

	public boolean createExpert() {
		Expert expert = new Expert();
		expert.setNomExpert("Munusami");
		expertDAO = new ExpertDAOImpl();
		boolean rep = this.expertDAO.create(expert);
		return rep;

	}

	public void setExpertDAO(ExpertDAO expertDAO) {
		this.expertDAO = expertDAO;
	}

}
