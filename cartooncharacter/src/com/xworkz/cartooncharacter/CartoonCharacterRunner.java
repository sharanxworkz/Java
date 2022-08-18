package com.xworkz.cartooncharacter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.cartooncharacter.dao.CartoonCharacterDAO;
import com.xworkz.cartooncharacter.dao.CartoonCharacterDAOImpl;
import com.xworkz.cartooncharacter.entity.CartoonCharacterEntity;


public class CartoonCharacterRunner {

	public static void main(String[] args) {
CartoonCharacterEntity cartooncharacterentity1 = new CartoonCharacterEntity("Doraemon", "japan", "cartoon", "sharan", "cartoon", "sharan", "sharan", LocalDate.now(), LocalDate.now());
CartoonCharacterEntity cartooncharacterentity2 = new CartoonCharacterEntity("CHOTA BHEEM", "INDIA", "cartoon", "sharan", "cartoon", "ARPITHA", "sharan", LocalDate.now(), LocalDate.now());
CartoonCharacterEntity cartooncharacterentity3 = new CartoonCharacterEntity("SAB JHOLMAL HEY", "INDIA", "cartoon", "sharan", "cartoon", "CHANDRU", "sharan", LocalDate.now(), LocalDate.now());
CartoonCharacterEntity cartooncharacterentity4= new  CartoonCharacterEntity("BEN 10", "AMERICA", "cartoon", "sharan", "cartoon", "SACHIN", "sharan", LocalDate.now(), LocalDate.now());
CartoonCharacterEntity cartooncharacterentity5= new  CartoonCharacterEntity("POPEYE", "SWITZERLAND", "cartoon", "sharan", "cartoon", "BHOOMI", "sharan", LocalDate.now(), LocalDate.now());
CartoonCharacterEntity cartooncharacterentity6= new  CartoonCharacterEntity("MR BEAN", "EUROPE", "cartoon", "sharan", "cartoon", "HANUMA", "sharan", LocalDate.now(), LocalDate.now());
CartoonCharacterEntity cartooncharacterentity7= new  CartoonCharacterEntity("DORA", "GERMANY", "cartoon", "sharan", "cartoon", "SHADOW", "sharan", LocalDate.now(), LocalDate.now());
CartoonCharacterEntity cartooncharacterentity8= new  CartoonCharacterEntity("OGGY AND THE COCKROACHES", "BRAZIL", "cartoon", "sharan", "cartoon", "SACHIN", "sharan", LocalDate.now(), LocalDate.now());
CartoonCharacterEntity cartooncharacterentity9= new  CartoonCharacterEntity("JACKIE CHAN", "BHATKAL", "cartoon", "sharan", "cartoon", "SACHIN", "sharan", LocalDate.now(), LocalDate.now());
CartoonCharacterEntity cartooncharacterentity10= new  CartoonCharacterEntity("TOM AND JERRY", "AMERICA", "cartoon", "sharan", "cartoon", "SACHIN", "sharan", LocalDate.now(), LocalDate.now());




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
//		boolean lists =dao.saveAll(list);
//		System.out.println(lists);
//		CartoonCharacterEntity d= dao.findByName("Doraemon");
//		System.out.println(d);
		
		System.out.println(dao.total());
		
		

	}

}
