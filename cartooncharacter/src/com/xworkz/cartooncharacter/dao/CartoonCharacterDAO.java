package com.xworkz.cartooncharacter.dao;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import com.xworkz.cartooncharacter.entity.CartoonCharacterEntity;


public interface CartoonCharacterDAO {
	 
	default boolean saveAll(List<CartoonCharacterEntity> entites) {
		return  false;
	}
	
	CartoonCharacterEntity findByName(String name);
	Integer total();
	CartoonCharacterEntity findByMaxCreatedDate();
	CartoonCharacterEntity findByNameAndCountryAndGenderAndAuthor(String name,String country,String gender,String author);
	String findAuthorByName(String name);
	LocalDate findCreadtedDateByAuthor(String author);
	Object[] findNameAndCountryByAuthor(String author);
	
	
	void updateAuthorByName(String author, String name);
	void updateTypeByName(String name,String type);
	void deleteByName(String name);
	
	
	
	
	
	
	
	
	
	
	
	default List<CartoonCharacterEntity> findAll(){
		return Collections.emptyList();
	}
	
	default List<CartoonCharacterEntity> findAllByAuthor(String author){
		return Collections.emptyList();
	}
	
	default List<CartoonCharacterEntity> findAllByAuthorAndGender(String author,String gender){
		return Collections.emptyList();
	}
	default List<String> findAllName(){
		return Collections.emptyList();
}
	default List<String> findAllCountry(){
		return Collections.emptyList();
	}
	default List<Object[]> findAllNameAndCountry(){
		return Collections.emptyList();
	}
default List<Object[]> findAllNameAndCountryAndAuthor(){
		return Collections.emptyList();
}
}


