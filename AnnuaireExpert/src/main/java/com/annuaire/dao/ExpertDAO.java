package com.annuaire.dao;

import common.Expert;

public interface ExpertDAO extends GenericDAO<Expert, Integer> {
	
	public Expert getExpert(int id);

}
