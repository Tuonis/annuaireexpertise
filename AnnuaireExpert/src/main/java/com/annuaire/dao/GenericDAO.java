package com.annuaire.dao;


public interface GenericDAO<TYPE,KEY> {
	
	public void getEM();
	
	boolean create(TYPE object);
	
	boolean update (TYPE object);
	
	boolean delete(TYPE object);
	
	
	

}
