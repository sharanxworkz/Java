package com.xworkz.freedomfighter.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Factory {
	private static EntityManagerFactory factory;
	
	public static EntityManagerFactory getFactory() {
		return factory;
	}
	static {
		factory = Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println("factory created...");
	}
	
	

}
