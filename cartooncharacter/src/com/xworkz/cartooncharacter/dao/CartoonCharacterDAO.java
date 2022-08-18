package com.xworkz.cartooncharacter.dao;

import java.util.List;

import com.xworkz.cartooncharacter.entity.CartoonCharacterEntity;


public interface CartoonCharacterDAO {
	 
	default boolean saveAll(List<CartoonCharacterEntity> entites) {
		return  false;
	}
	
	CartoonCharacterEntity findByName(String name);
	Integer total();
    
}
