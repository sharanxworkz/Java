package com.xworkz.dog.dao;

import com.xworkz.dog.entity.DogEntity;

public interface DogDAO {
	
	boolean save(DogEntity dogentity);
	DogEntity findById(int id);
	void updateBreedById(String newBreed,int id);
	
	

}
