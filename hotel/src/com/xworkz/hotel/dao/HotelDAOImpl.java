package com.xworkz.hotel.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.hotel.entity.HotelEntity;

public class HotelDAOImpl implements HotelDAO {
EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
EntityManager manager=null;
	@Override
	public boolean save(HotelEntity hotelentity) {
	try {
		manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(hotelentity);
		tx.commit();
		
	}
	catch(PersistenceException e){
		e.printStackTrace();
		
	}
	finally {
		manager.close();
		
	}
		return true;
	}
	@Override
	public HotelEntity findById(int id) {
		
			try {
				manager = factory.createEntityManager();
				HotelEntity entity = manager.find(HotelEntity.class,id);
				if(entity!=null) {
					System.out.println("entity found"+id);
					return entity;
				}
				else {
					System.out.println("entity not found"+id);
				}
				
			}
			catch(PersistenceException e){
				e.printStackTrace();
				
			}
			finally {
				manager.close();
			}
			
			
		

		return null;
	}
	@Override
	public void updateOwnerAndPriceById(String newOwner, int newPrice, int id) {
		try {
			manager=factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			HotelEntity entity = manager.find(HotelEntity.class, id);
			entity.setOwner(newOwner);
			entity.setPrice(newPrice);
			manager.merge(entity);
			tx.commit();
			
		}
		catch(PersistenceException e){
			e.printStackTrace();
			
		}
		finally {
			manager.close();
		}
		
	}
	

}
