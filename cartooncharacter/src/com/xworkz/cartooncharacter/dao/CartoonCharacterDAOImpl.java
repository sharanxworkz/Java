package com.xworkz.cartooncharacter.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import  com.xworkz.cartooncharacter.entity.CartoonCharacterEntity;
import static com.xworkz.cartooncharacter.util.Factory.*;


public class CartoonCharacterDAOImpl implements CartoonCharacterDAO {
	EntityManagerFactory factory = getFactory();
	@Override
	public boolean saveAll(List<CartoonCharacterEntity> entites) {
		EntityManager manager = null;
		try {
			 manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			for (CartoonCharacterEntity cartoonCharacterEntity : entites) {
				manager.persist(cartoonCharacterEntity);
			}	
			tx.commit();
	         
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		
	
		return CartoonCharacterDAO.super.saveAll(entites);
	}
	@Override
	public CartoonCharacterEntity findByName(String name) {
		EntityManager manager = null;
		try {
		 manager = factory.createEntityManager();
		 Query query = manager.createNamedQuery("findByName");
			query.setParameter("nm", name);
			Object obj = query.getSingleResult();
			if(obj != null) {
				CartoonCharacterEntity cartoon = (CartoonCharacterEntity)obj;
				return cartoon;	
			}
			else {
				System.out.println("Unable To Find");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
		}
		
		
		return null;
	}
	@Override
	public Integer total() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
		Query query=manager.createNamedQuery("getCount");
		Object obj =query.getSingleResult();
		System.out.println(obj);
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
		}
		return null;
	}
	

}
