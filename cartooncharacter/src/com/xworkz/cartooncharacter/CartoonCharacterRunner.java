package com.xworkz.cartooncharacter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.cartooncharacter.dao.CartoonCharacterDAO;
import com.xworkz.cartooncharacter.dao.CartoonCharacterDAOImpl;
import com.xworkz.cartooncharacter.entity.CartoonCharacterEntity;

public class CartoonCharacterRunner {

	public static void main(String[] args) {
		CartoonCharacterEntity cartooncharacterentity1 = new CartoonCharacterEntity("Doraemon", "british", "cartoon",
				"sudhir", "cartoon", "sharan", "sharan", LocalDate.now(), LocalDate.now());
		CartoonCharacterEntity cartooncharacterentity2 = new CartoonCharacterEntity("CHOTA BHEEM", "INDIA", "cartoon",
				"sharan", "cartoon", "ARPITHA", "sharan", LocalDate.now(), LocalDate.now());
		CartoonCharacterEntity cartooncharacterentity3 = new CartoonCharacterEntity("SAB JHOLMAL HEY", "INDIA",
				"cartoon", "sharan", "cartoon", "CHANDRU", "sharan", LocalDate.now(), LocalDate.now());
		CartoonCharacterEntity cartooncharacterentity4 = new CartoonCharacterEntity("BEN 10", "AMERICA", "cartoon",
				"sharan", "cartoon", "SACHIN", "sharan", LocalDate.now(), LocalDate.now());
		CartoonCharacterEntity cartooncharacterentity5 = new CartoonCharacterEntity("POPEYE", "SWITZERLAND", "cartoon",
				"sharan", "cartoon", "BHOOMI", "sharan", LocalDate.now(), LocalDate.now());
		CartoonCharacterEntity cartooncharacterentity6 = new CartoonCharacterEntity("MR BEAN", "EUROPE", "cartoon",
				"sharan", "cartoon", "HANUMA", "sharan", LocalDate.now(), LocalDate.now());
		CartoonCharacterEntity cartooncharacterentity7 = new CartoonCharacterEntity("DORA", "GERMANY", "cartoon",
				"sharan", "cartoon", "SHADOW", "sharan", LocalDate.now(), LocalDate.now());
		CartoonCharacterEntity cartooncharacterentity8 = new CartoonCharacterEntity("OGGY AND THE COCKROACHES",
				"BRAZIL", "cartoon", "sharan", "cartoon", "SACHIN", "sharan", LocalDate.now(), LocalDate.now());
		CartoonCharacterEntity cartooncharacterentity9 = new CartoonCharacterEntity("JACKIE CHAN", "BHATKAL", "cartoon",
				"sharan", "cartoon", "SACHIN", "sharan", LocalDate.now(), LocalDate.now());
		CartoonCharacterEntity cartooncharacterentity10 = new CartoonCharacterEntity("TOM AND JERRY", "AMERICA",
				"cartoon", "sharan", "cartoon", "SACHIN", "sharan", LocalDate.now(), LocalDate.now());
CartoonCharacterEntity cartooncharacterentity11= new  CartoonCharacterEntity("Dinga", "AMERICA", "cartoon", "sharan", "cartoon", "SACHIN", "sharan", LocalDate.now(), LocalDate.now());

		List<CartoonCharacterEntity> list = new ArrayList<CartoonCharacterEntity>();
		list.add(cartooncharacterentity1);
		list.add(cartooncharacterentity2);
		list.add(cartooncharacterentity3);
		list.add(cartooncharacterentity4);
		list.add(cartooncharacterentity5);
		list.add(cartooncharacterentity6);
		list.add(cartooncharacterentity7);
		list.add(cartooncharacterentity8);
		list.add(cartooncharacterentity9);
		list.add(cartooncharacterentity10);

		CartoonCharacterDAO dao = new CartoonCharacterDAOImpl();

	boolean lists = dao.saveAll(list);
		System.out.println(lists);
		CartoonCharacterEntity d = dao.findByName("Doraemon");
		System.out.println(d);

		System.out.println(dao.total());

		CartoonCharacterEntity maxDate = dao.findByMaxCreatedDate();
		System.out.println(maxDate);

		CartoonCharacterEntity cartoon = dao.findByNameAndCountryAndGenderAndAuthor("MR BEAN", "EUROPE", "cartoon",
				"sharan");

		System.out.println(cartoon);
		
		CartoonCharacterEntity cartoon1= dao.findByName("POPEYE");
		System.out.println(cartoon1);
		
	LocalDate cartoon2 =dao.findCreadtedDateByAuthor("sudhir");
	System.out.println(cartoon2);
	
	Object[] str = dao.findNameAndCountryByAuthor("sudhir");
	System.out.println(str[0]);
	System.out.println(str[1]);
	
	System.out.println(" method 1 starts from here by using list  findall 19-08-2022  ");
	
	dao.findAll().forEach(System.out::println);
	
	System.out.println("method 2 starts from here by using list find all by author 19-08-2022");
	dao.findAllByAuthor("sharan").forEach(System.out::println);
	
System.out.println("method 3");
dao.findAllByAuthorAndGender("sharan", "cartoon").forEach(System.out::println);

System.out.println("method 4");
dao.findAllName().forEach(System.out::println);

System.out.println("method 5");
dao.findAllCountry().forEach(System.out::println);


System.out.println("method 6");
dao.findAllNameAndCountry().forEach(obj->System.out.println(obj[0]+"::"+ obj[1]));

System.out.println("method 7");
dao.findAllNameAndCountryAndAuthor().forEach(obj->System.out.println(obj[0]+"::"+ obj[1]+"::"+obj[2]));
	
dao.updateAuthorByName("BADIYA", "Doraemon");

dao.updateTypeByName("ANIMIE","POPEYE");

dao.deleteByName("BEN 10");
	
	}
	
	
	




}



