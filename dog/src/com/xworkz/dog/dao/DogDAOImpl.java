package com.xworkz.dog.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;


import com.xworkz.dog.entity.DogEntity;

public class DogDAOImpl implements DogDAO{
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager manager =null;

	@Override
	public boolean save(DogEntity dogentity) {
		try {
			manager= factory.createEntityManager();
			 EntityTransaction tx = manager.getTransaction();
			 tx.begin();
			 manager.persist(dogentity);
			 tx.commit();
			 manager.close();
			 factory.close();
			
		}
		catch(PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		return true;
	}

	@Override
	public DogEntity findById(int id) {
		try {
			manager=factory.createEntityManager();
			DogEntity entity = manager.find(DogEntity.class, id);
			if (entity!=null) {
				System.out.println("entity found"+id);
				return entity;
			}
			else
			{
				System.out.println("entity not found"+id);
			}
		}
		catch(PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		return null;
	}

	@Override
	public void updateBreedById(String newBreed, int id) {
		manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		DogEntity entity = manager.find(DogEntity.class, id);
		entity.setBreed(newBreed);
		manager.merge(entity);
		tx.commit();
	
		
		
		
	}
	

}
