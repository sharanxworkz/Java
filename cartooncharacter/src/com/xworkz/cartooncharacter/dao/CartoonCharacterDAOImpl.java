package com.xworkz.cartooncharacter.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.cartooncharacter.entity.CartoonCharacterEntity;
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

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
			if (obj != null) {
				CartoonCharacterEntity cartoon = (CartoonCharacterEntity) obj;
				return cartoon;
			} else {
				System.out.println("not found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

		return null;
	}

	@Override
	public Integer total() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("getCount");
			Object obj = query.getSingleResult();
			System.out.println(obj);

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return null;
	}

	@Override
	public CartoonCharacterEntity findByMaxCreatedDate() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
		Query query=	manager.createNamedQuery("findByMaxCreatedDate");
		Object obj = query.getSingleResult();
		if (obj != null) {
			CartoonCharacterEntity cartoon = (CartoonCharacterEntity) obj;
			return cartoon;
		} else {
			System.out.println("not found");
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		return null;
	}

	@Override
	public CartoonCharacterEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author) {
		EntityManager manager = null;
		try {
		 manager = factory.createEntityManager();
	Query query=	 manager.createNamedQuery("findAll");
	query.setParameter("nm", name);
	query.setParameter("cc", country);
	query.setParameter("ge", gender);
	query.setParameter("at", author);
	
	Object obj = query.getSingleResult();
	if (obj != null) {
		CartoonCharacterEntity cartoon = (CartoonCharacterEntity) obj;
		return cartoon;
	} else {
		System.out.println("not found");
	}
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		manager.close();
	}
	return null;
		
	}

	@Override
	public String findAuthorByName(String name) {
		EntityManager manager=null;
		try {
		manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findAuthorByName");
		query.setParameter("nam", name);
		Object obj = query.getSingleResult();
	if(obj != null) {
		String cartoon = (String)obj;
		return cartoon;	
	}
	else {
		System.out.println("not found");
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
	public LocalDate findCreadtedDateByAuthor(String author) {
		EntityManager manager =null;
		try {
			 manager = factory.createEntityManager();
		Query query = 	 manager.createNamedQuery("findCreatedDate");
		query.setParameter("atr", author);
	Object obj =	query.getSingleResult();
	if (obj != null) {
		LocalDate cartoon = (LocalDate)obj;
		return cartoon;	
	}
	else {
		System.out.println("not found");
	}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
		}
		return null;
	}

	@Override
	public Object[] findNameAndCountryByAuthor(String author) {
		EntityManager manager = null;
		try{
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findNameAndCountry");
			query.setParameter("date", author);
			Object obj = query.getSingleResult();
			Object[] result = (Object[])obj;
			return result;

		}
		catch (PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		
		return null;
	}
	
	@Override
	public List<CartoonCharacterEntity> findAll() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllByList");
			List<CartoonCharacterEntity> entity = query.getResultList();
			if (entity != null) {
				return entity;
			}

		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}
		return CartoonCharacterDAO.super.findAll();
	}
	
	@Override
	public List<CartoonCharacterEntity> findAllByAuthor(String author) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllByAuthor");
			query.setParameter("atr", author);
			List<CartoonCharacterEntity> entity = query.getResultList();
			if (entity != null) {
				return entity;
			}
		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}	


		
		return CartoonCharacterDAO.super.findAllByAuthor(author);
	}
	
	@Override
	public List<CartoonCharacterEntity> findAllByAuthorAndGender(String author, String gender) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllByAuthorAndGender");
			query.setParameter("aut", author);
			query.setParameter("gen", gender);
			List<CartoonCharacterEntity> entity = query.getResultList();
			if (entity != null) {
				return entity;
			}
		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {

			manager.close();
		}
		return CartoonCharacterDAO.super.findAllByAuthorAndGender(author, gender);
	}
	@Override
	public List<String> findAllName() {
		EntityManager manager = null;
		try {

			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllName");
			List<String> entity = query.getResultList();
			if(entity != null) {
				return entity;
			}
		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {

			manager.close();
		}
		

		return CartoonCharacterDAO.super.findAllName();
	}
	@Override
	public List<String> findAllCountry() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllCountry");
			List<String> entity = query.getResultList();
			if(entity != null) {
				return entity;
			}
		}
		catch(PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return CartoonCharacterDAO.super.findAllCountry();
	}
	@Override
	public List<Object[]> findAllNameAndCountry() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllNameAndCountry");
			@SuppressWarnings("unchecked")
			List<Object[]> list = query.getResultList();
			if(list != null) {
				return list;
			}
		}
		catch(PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return CartoonCharacterDAO.super.findAllNameAndCountry();
	}
	//@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findAllNameAndCountryAndAuthor() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllNameAndCountryAndAuthor");
			List<Object[]> list = query.getResultList();
			if(list != null) {
				return list;
			}
		}
		catch(PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return CartoonCharacterDAO.super.findAllNameAndCountryAndAuthor();
	}

	@Override
	public void updateAuthorByName(String author, String name) {
		EntityManager manager = null;
		
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("updateAuthor");
			query.setParameter("at", author);
			query.setParameter("nm", name);
			query.executeUpdate();
			System.out.println("The Updated Values of Author are:" + author );
			System.out.println("The Updated Values of Author are:" + author);
			tx.commit();
		}
		
		 catch (PersistenceException p) {
			p.printStackTrace();
		}
	
		 finally {
			manager.close();
		}
		
	}

	@Override
	public void updateTypeByName(String name, String type) {
		EntityManager manager = null;
		
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("updateType");
			query.setParameter("type", type);
			query.setParameter("name", name);
			query.executeUpdate();
			System.out.println("The Updated Values of type is:" + type );
			System.out.println("The Updated Values of type is:" + type);
			tx.commit();
		}
	 catch (PersistenceException p) {
			p.printStackTrace();
		}
	 finally {
			manager.close();
	 }
	}
		
	

	@Override
	public void deleteByName(String name) {
		EntityManager manager = null;
		
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("deleteByName");
			query.setParameter("dname", name);
			query.executeUpdate();
			System.out.println("The Deleted Name Of Row of Table is :" + name );
			System.out.println("The Deleted Name Of Row of Table is :" + name);
			tx.commit();
		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		
	}
	
		}
	

}
