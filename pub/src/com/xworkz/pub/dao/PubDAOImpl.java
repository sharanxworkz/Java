package com.xworkz.pub.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.pub.entity.PubEntity;

public class PubDAOImpl implements PubDAO {

	@Override
	public boolean save(PubEntity pubentity) {
		try {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager manager=	factory.createEntityManager();
	EntityTransaction tx=manager.getTransaction();
	tx.begin();

	manager.persist(pubentity);
	tx.commit();
	manager.close();
	factory.close();
		}catch(PersistenceException exception) {
			exception.printStackTrace();
		}
	
		return true;
				
	}

}
