package com.xworkz.pencil.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import static com.xworkz.pencil.util.Factory.*;

import com.xworkz.pencil.entity.PencilEntity;

public class PencilDAOImpl implements PencilDAO {
	EntityManagerFactory factory = getFactory();
	@Override
	public boolean save(PencilEntity pencilentity) {
		EntityManager manager = null;
		try {
		
			 manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(pencilentity);
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}

		return false;
	}

	@Override
	public PencilEntity findById(int id) {
		EntityManager manager = null;
		
		try {
		 manager = factory.createEntityManager();
		 PencilEntity entity = manager.find(PencilEntity.class, id);
		 if (entity!=null) {
			 System.out.println("entity found"+id);
			 return entity;
			
		} else {
			System.out.println("entity not found");

		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		return null;
	}

}
