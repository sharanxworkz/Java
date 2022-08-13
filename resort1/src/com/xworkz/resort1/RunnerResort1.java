package com.xworkz.resort1;

import com.xworkz.resort1.dao.Resort1DAO;
import com.xworkz.resort1.dao.Resort1DAOImpl;
import com.xworkz.resort1.entity.Resort1Entity;

public class RunnerResort1 {
	public static void main(String[] args) {
		Resort1Entity entity = new Resort1Entity();
		entity.setId(1);
		entity.setOwner("sharan");
		entity.setPricePerDay(50000D);
		
		Resort1DAO resortdao = new Resort1DAOImpl();
		boolean save = resortdao.save(entity);
		System.out.println(save);
		
	}

}
