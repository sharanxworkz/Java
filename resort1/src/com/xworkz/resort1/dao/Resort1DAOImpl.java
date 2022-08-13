package com.xworkz.resort1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.resort1.entity.Resort1Entity;

public class Resort1DAOImpl implements Resort1DAO {

	@Override
	public boolean save(Resort1Entity resort1entity) {
		try{
			
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(resort1entity);
		tx.commit();
		manager.close();
		factory.close();
		}
		catch(PersistenceException exception) {
			exception.printStackTrace();
			
		}
		
		
		return true;
	}

}
