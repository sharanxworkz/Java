package com.xworkz.freedomfighter.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.freedomfighter.entity.FreedomFighterEntity;
import com.xworkz.freedomfighter.util.Factory;

import static com.xworkz.freedomfighter.util.Factory.*;

public class FreedomFighterDAOImpl implements FreedomFighterDAO{
	EntityManagerFactory factory=Factory.getFactory();

	@Override
	public boolean save(FreedomFighterEntity entity) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean saveAll(List<FreedomFighterEntity> fighterEntities) {
		EntityManager manager=null;
		try {
			manager=factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			for(FreedomFighterEntity fighterEntity: fighterEntities) {
				manager.persist(fighterEntity);
			}
			
			tx.commit();
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		return FreedomFighterDAO.super.saveAll(fighterEntities);
	}

}
