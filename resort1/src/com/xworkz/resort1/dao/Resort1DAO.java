package com.xworkz.resort1.dao;

import com.xworkz.resort1.entity.Resort1Entity;

public interface Resort1DAO {
	boolean save (Resort1Entity resort1entity);
	
	Resort1Entity findById(int id);

}
