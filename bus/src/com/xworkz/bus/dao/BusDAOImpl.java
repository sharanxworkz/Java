package com.xworkz.bus.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.bus.entity.BusEntity;

public class BusDAOImpl implements BusDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(BusEntity busentity) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(busentity);
			tx.commit();
			manager.close();
			factory.close();
		} catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}

	return true;
	}

	@Override
	public BusEntity findById(int id) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			BusEntity entity = manager.find(BusEntity.class, id);
			if (entity != null) {
				System.out.println("entity found" + id);
				return entity;
			} else {
				System.out.println("entity not found" + id);
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

		return null;
	}

	@Override
	public void updateNameAndLocationById(String newColor, String newLocation, int id) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();

			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			BusEntity entity = manager.find(BusEntity.class, id);
			entity.setColor(newColor);
			entity.setLocation(newLocation);
			manager.merge(entity);

			tx.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

	}

	@Override
	public void deleteById(int id) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();

			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			BusEntity entity = manager.find(BusEntity.class, id);

			manager.remove(entity);

			tx.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

	}

}
