package com.xworkz.resort.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.xworkz.resort.entity.ResortEntity;

public class ResortDAOImpl implements ResortDAO{

	@Override
	public boolean save(ResortEntity resortentity) {
		EntityManagerFactory factory  = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entitymanager = factory.createEntityManager();
	 EntityTransaction 	transaction = entitymanager.getTransaction();
	 transaction.begin();
	 entitymanager.persist(resortentity);
	 transaction.commit();
	 entitymanager.close();
	 factory.close();
	 
	 
	 
	 
		                                
		return false;
	}

}
